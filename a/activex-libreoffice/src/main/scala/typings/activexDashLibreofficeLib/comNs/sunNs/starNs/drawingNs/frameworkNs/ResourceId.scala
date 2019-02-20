package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link ResourceId} service provides several constructors for resource ids.
  *
  * They mainly differ in how the anchor is specified.
  */
trait ResourceId extends XResourceId {
  /**
    * Create a resource id that has no anchor.
    *
    * This constructor can be used to create resource ids for panes.
    */
  def create(sResourceURL: java.lang.String): scala.Unit
  /** Create an empty resource id. It does not specify a specific resource but describes the absence of one. */
  def createEmpty(): scala.Unit
  /** Create a resource id for an anchor that is given as {@link XResourceId} object. This is the most general of the constructor variants. */
  def createWithAnchor(sResourceURL: java.lang.String, xAnchor: XResourceId): scala.Unit
  /**
    * Create a resource id for a resource that is bound to an anchor that can be specified by a single URL.
    *
    * This constructor can be used to create resources ids for views where the anchor is a pane.
    */
  def createWithAnchorURL(sResourceURL: java.lang.String, sAnchorURL: java.lang.String): scala.Unit
}

