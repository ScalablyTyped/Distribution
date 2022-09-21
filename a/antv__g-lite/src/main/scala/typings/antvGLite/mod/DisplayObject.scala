package typings.antvGLite.mod

import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "DisplayObject")
@js.native
open class DisplayObject[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] protected ()
  extends typings.antvGLite.displayObjectsMod.DisplayObject[StyleProps, ParsedStyleProps] {
  def this(config: DisplayObjectConfig[StyleProps]) = this()
}
