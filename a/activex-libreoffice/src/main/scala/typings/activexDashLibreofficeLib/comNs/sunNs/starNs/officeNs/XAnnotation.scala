package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface gives access to an annotation inside a document. */
trait XAnnotation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** a reference to the document content this annotation is anchored to. */
  var Anchor: js.Any
  /** stores the full name of the author who created this annotation. */
  var Author: java.lang.String
  /** stores the date and time this annotation was last edited. */
  var DateTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** stores the initials of the author who created this annotation. */
  var Initials: java.lang.String
  /**
    * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
    * anchor.
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D
  /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D
  /** gives access to the annotations text. */
  var TextRange: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
}

