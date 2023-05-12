package typings.apideckBetterAjvErrors

import typings.apideckBetterAjvErrors.anon.Fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsMod {
  
  @JSImport("@apideck/better-ajv-errors/dist/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanAjvMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanAjvMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLastSegment(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastSegment")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pointerToDotNotation(pointer: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerToDotNotation")(pointer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeJsonPointer[T](param0: Fallback[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("safeJsonPointer")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
}
