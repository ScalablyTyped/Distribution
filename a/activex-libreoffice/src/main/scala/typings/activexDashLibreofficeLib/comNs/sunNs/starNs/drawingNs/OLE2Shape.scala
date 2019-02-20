package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for an OLE shape. */
trait OLE2Shape extends Shape {
  /**
    * If you get this property you get the CLSID of the OLE2 document stream contained in this OLE2 shape. If you set it, an empty OLE2 document stream with
    * this CLSID is created within this OLE2 shape.
    */
  var CLSID: java.lang.String
  /** This property returns `TRUE` for all OLE2 that are internal Office components. */
  var IsInternal: scala.Boolean
  /**
    * This is the model for the OLE2 inside this shape.
    *
    * This property returns an empty reference if the OLE2 is not an Office component.
    */
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  /** this is the internal storage name that keeps this OLE2 persist. */
  var PersistName: java.lang.String
}

