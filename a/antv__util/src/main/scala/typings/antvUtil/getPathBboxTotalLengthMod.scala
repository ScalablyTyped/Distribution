package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.pathTypesMod.PathArray
import typings.antvUtil.pathTypesMod.PathBBoxTotalLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathBboxTotalLengthMod {
  
  @JSImport("@antv/util/lib/path/util/get-path-bbox-total-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathBBoxTotalLength(path: PathArray): PathBBoxTotalLength = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBoxTotalLength")(path.asInstanceOf[js.Any]).asInstanceOf[PathBBoxTotalLength]
  inline def getPathBBoxTotalLength(path: PathArray, options: PartialPathLengthFactoryO): PathBBoxTotalLength = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathBBoxTotalLength")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathBBoxTotalLength]
}
