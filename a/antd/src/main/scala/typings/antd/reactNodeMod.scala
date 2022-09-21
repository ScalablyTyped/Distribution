package typings.antd

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNodeMod {
  
  @JSImport("antd/lib/_util/reactNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneElement(element: ReactNode): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  inline def cloneElement(element: ReactNode, props: RenderProps): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def isFragment(child: ReactElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(child.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
  inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def replaceElement(element: ReactNode, replacement: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(element.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def replaceElement(element: ReactNode, replacement: ReactNode, props: RenderProps): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(element.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  type AnyObject = Record[PropertyKey, Any]
  
  type RenderProps = AnyObject | (js.Function1[/* originProps */ AnyObject, AnyObject | Unit])
}
