package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcRender3InterfacesNodeMod {
  type InitialInputData = js.Array[InitialInputs | scala.Null]
  type InitialInputs = js.Array[java.lang.String]
  type LocalRefExtractor = js.Function2[
    /* tNode */ TNodeWithLocalRefs, 
    /* currentView */ atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, 
    js.Any
  ]
  type PropertyAliasValue = js.Array[scala.Double | java.lang.String]
  type TAttributes = js.Array[java.lang.String | AttributeMarker]
  type TNodeWithLocalRefs = TContainerNode | TElementNode | TElementContainerNode
}
