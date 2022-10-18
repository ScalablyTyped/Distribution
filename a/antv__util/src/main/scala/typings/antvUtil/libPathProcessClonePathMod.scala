package typings.antvUtil

import typings.antvUtil.libPathTypesMod.PathArray
import typings.antvUtil.libPathTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessClonePathMod {
  
  @JSImport("@antv/util/lib/path/process/clone-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clonePath(path: PathArray): PathArray = ^.asInstanceOf[js.Dynamic].applyDynamic("clonePath")(path.asInstanceOf[js.Any]).asInstanceOf[PathArray]
  inline def clonePath(path: PathSegment): PathArray = ^.asInstanceOf[js.Dynamic].applyDynamic("clonePath")(path.asInstanceOf[js.Any]).asInstanceOf[PathArray]
}
