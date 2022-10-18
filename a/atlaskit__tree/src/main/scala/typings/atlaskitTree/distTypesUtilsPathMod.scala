package typings.atlaskitTree

import typings.atlaskitTree.distTypesTypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsPathMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIndexAmongSiblings(path: Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexAmongSiblings")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getParentPath(child: Path): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentPath")(child.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  inline def getPathOnLevel(path: Path, level: Double): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathOnLevel")(path.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def hasSameParent(a: Path, b: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSameParent")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLowerSibling(a: Path, other: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLowerSibling")(a.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSamePath(a: Path, b: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSamePath")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTopOfSubtree(belowPath: Path): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopOfSubtree")(belowPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTopOfSubtree(belowPath: Path, abovePath: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTopOfSubtree")(belowPath.asInstanceOf[js.Any], abovePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def moveAfterPath(after: Path, from: Path): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAfterPath")(after.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Path]
}
