package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.libPathTypesMod.PathArray
import typings.antvUtil.libPathTypesMod.PathBBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetPathBboxMod {
  
  @JSImport("@antv/util/lib/path/util/get-path-bbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathBBox(path: String): PathBBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBox]
  inline def getPathBBox(path: String, options: PartialPathLengthFactoryO): PathBBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBox]
  inline def getPathBBox(path: PathArray): PathBBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBox]
  inline def getPathBBox(path: PathArray, options: PartialPathLengthFactoryO): PathBBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBox")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBox]
}
