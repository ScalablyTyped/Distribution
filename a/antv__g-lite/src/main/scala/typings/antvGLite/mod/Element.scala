package typings.antvGLite.mod

import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.IElement
import typings.antvGLite.domInterfacesMod.IEventTarget
import typings.antvGLite.domInterfacesMod.INode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "Element")
@js.native
open class Element[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] ()
  extends typings.antvGLite.domMod.Element[StyleProps, ParsedStyleProps]
/* static members */
object Element {
  
  @JSImport("@antv/g-lite", "Element")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElement(target: IElement[Any, Any]): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
  inline def isElement(target: IEventTarget): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
  inline def isElement(target: INode): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
}
