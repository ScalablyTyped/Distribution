package typings
package atAngularCoreLib.srcRender3InterfacesContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LContext extends js.Object {
  /**
       * The instance of the Component node.
       */
  var component: js.UndefOr[js.Object | scala.Null]
  /**
       * The list of active directives that exist on this element.
       */
  var directives: js.UndefOr[js.Array[_] | scala.Null]
  /**
       * The component's parent view data.
       */
  var lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  /**
       * The map of local references (local reference name => element or directive instance) that exist
       * on this element.
       */
  var localRefs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null]
  /**
       * The instance of the DOM node that is attached to the lNode.
       */
  var native: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement
  /**
       * The index instance of the node.
       */
  var nodeIndex: scala.Double
}

