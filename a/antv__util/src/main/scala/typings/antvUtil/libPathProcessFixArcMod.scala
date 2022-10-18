package typings.antvUtil

import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessFixArcMod {
  
  @JSImport("@antv/util/lib/path/process/fix-arc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixArc(pathArray: PathArray, allPathCommands: js.Array[String], i: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixArc")(pathArray.asInstanceOf[js.Any], allPathCommands.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
