package typings.ahooks

import typings.ahooks.domTargetMod.BasicTarget
import typings.std.Document
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentOrShadowMod {
  
  @JSImport("ahooks/lib/utils/getDocumentOrShadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: js.Array[BasicTarget[Element]]): Document | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Document | Node]
  inline def default(target: BasicTarget[Element]): Document | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Document | Node]
}
