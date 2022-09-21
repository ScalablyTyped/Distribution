package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crtMod {
  
  @JSImport("aws-crt/dist/native/crt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nativeMemory(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("native_memory")().asInstanceOf[Double]
  
  inline def nativeMemoryDump(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("native_memory_dump")().asInstanceOf[Unit]
}
