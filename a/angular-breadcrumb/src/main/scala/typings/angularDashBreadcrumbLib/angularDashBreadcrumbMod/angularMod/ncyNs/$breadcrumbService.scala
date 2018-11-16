package typings
package angularDashBreadcrumbLib.angularDashBreadcrumbMod.angularMod.ncyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait $breadcrumbService extends js.Object {
  /**
              * Return the last step of the breadcrumb, generally the one relative to the current state, expect if it is configured as skipped (the method returns its parent). As getStatesChain, the state object is enriched with ncyBreadcrumbLink.
              **/
  def getLastStep(): angularDashBreadcrumbLib.angularDashBreadcrumbMod.angularMod.uiNs.IState
  /**
              * Returns the state chain to the current state (i.e. all the steps of the breadcrumb). It's an array of state object enriched with the module-specific property ncyBreadcrumbLink (the href for the breadcrumb step).
              **/
  def getStatesChain(): js.Array[angularDashBreadcrumbLib.angularDashBreadcrumbMod.angularMod.uiNs.IState]
}

