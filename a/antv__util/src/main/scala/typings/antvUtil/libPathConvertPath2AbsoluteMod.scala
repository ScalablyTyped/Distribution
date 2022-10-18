package typings.antvUtil

import typings.antvUtil.libPathTypesMod.AbsoluteArray
import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathConvertPath2AbsoluteMod {
  
  @JSImport("@antv/util/lib/path/convert/path-2-absolute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def path2Absolute(pathInput: String): AbsoluteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathInput.asInstanceOf[js.Any]).asInstanceOf[AbsoluteArray]
  inline def path2Absolute(pathInput: PathArray): AbsoluteArray = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathInput.asInstanceOf[js.Any]).asInstanceOf[AbsoluteArray]
}
