package typings.antvUtil

import typings.antvUtil.antvUtilStrings.off
import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathConvertPath2StringMod {
  
  @JSImport("@antv/util/lib/path/convert/path-2-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def path2String(path: PathArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def path2String(path: PathArray, round: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def path2String_off(path: PathArray, round: off): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path2String")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[String]
}
