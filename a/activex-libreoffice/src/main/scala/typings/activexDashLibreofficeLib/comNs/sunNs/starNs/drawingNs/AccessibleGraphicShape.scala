package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleGraphicShape} service is implemented by the graphic object shapes shapes {@link com.sun.star.drawing.GraphicObjectShape} and
  * {@link com.sun.star.presentation.GraphicObjectShape} .
  *
  * It differs from the included {@link AccessibleShape} "base" service by the additional support of the {@link
  * com.sun.star.accessibility.XAccessibleImage} interface.
  * @since OOo 1.1.2
  */
trait AccessibleGraphicShape
  extends AccessibleShape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleImage

