package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleShape} service is implemented by UNO shapes to provide accessibility information that describe the shape's features. A UNO shape
  * is any object that implements the {@link com.sun.star.drawing.XShape} interface.
  *
  * The content of a draw page is modelled as tree of accessible shapes and accessible text paragraphs. The root of this (sub-)tree is the accessible draw
  * document view. An accessible shape implements either this service or one of the "derived" services {@link AccessibleGraphicShape} or {@link
  * AccessibleOLEShape} . See the section Children in the description of the {@link com.sun.star.accessibility.XAccessibleContext} interface support for
  * more details.
  *
  * There are two services that extend this one: the {@link AccessibleGraphicShape} and the {@link AccessibleOLEShape} services provide additional
  * interfaces. See there for details.
  *
  * A shape object is either fully or partially visible on the screen or has set the {@link com.sun.star.accessibility.AccessibleStateType.DEFUNC} state
  * to indicate that it is no longer actively supported by its parent.
  *
  * Each shape object that has not set the DEFUNC state has a valid parent. That is either the containing draw page or a group shape or a 3D scene object.
  * @since OOo 1.1.2
  */
trait AccessibleShape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext

