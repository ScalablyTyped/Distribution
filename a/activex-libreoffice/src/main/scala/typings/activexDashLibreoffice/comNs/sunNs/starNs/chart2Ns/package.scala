package typings.activexDashLibreoffice.comNs.sunNs.starNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.MultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chart2Ns {
  /** @since LibreOffice 4.1 */
  type CartesianCoordinateSystem2d = XCoordinateSystem
  /** @since LibreOffice 4.1 */
  type CartesianCoordinateSystem3d = XCoordinateSystem
  /** A factory for creating ChartTypeTemplates. */
  type ChartTypeManager = MultiServiceFactory
  type ChartTypeTemplate = XChartTypeTemplate
  /**
    * The service {@link CoordinateSystemType} represents a special type of coordinate system. For example a 2 dimensional Cartesian coordinate system is a
    * {@link CoordinateSystemType} and different from for example a 3 dimensional spherical coordinate system.
    *
    * A {@link CoordinateSystemType} is a stateless service which has no owner and does not enable cyclic references, thus its lifetime can be handled by
    * reference or it may be implemented as a singleton.
    */
  type CoordinateSystemType = js.Any
  type CoordinateSystemTypeID = String
  /** @since LibreOffice 4.1 */
  type ExponentialRegressionCurve = XRegressionCurve
  /**
    * {@link Scaling} that scales a value **x** by taking the power of the base to **x** .
    *
    * If not mentioned explicitly, the base for the power function is 10.0
    */
  type ExponentialScaling = XScaling
  type FormattedString = XFormattedString2
  /** @since LibreOffice 4.1 */
  type LinearRegressionCurve = XRegressionCurve
  /**
    * {@link Scaling} that scales a value **x** by calculating **m  x + t** .
    *
    * If not mentioned explicitly, the parameter **m** is 1.0 and **t** is 0.0, which means the transformation is an identical mapping.
    */
  type LinearScaling = XScaling
  /** @since LibreOffice 4.1 */
  type LogarithmicRegressionCurve = XRegressionCurve
  /**
    * {@link Scaling} that scales values by taking their logarithm.
    *
    * If not mentioned explicitly, the base for the logarithm is 10.0
    */
  type LogarithmicScaling = XScaling
  /** @since LibreOffice 4.1 */
  type MovingAverageRegressionCurve = XRegressionCurve
  /** @since LibreOffice 4.1 */
  type PolarCoordinateSystem2d = XCoordinateSystem
  /** @since LibreOffice 4.1 */
  type PolarCoordinateSystem3d = XCoordinateSystem
  /** @since LibreOffice 4.1 */
  type PolynomialRegressionCurve = XRegressionCurve
  /** @since LibreOffice 4.1 */
  type PotentialRegressionCurve = XRegressionCurve
  /**
    * {@link Scaling} that scales a value **x** by taking the power of **x** to the exponent.
    *
    * If not mentioned explicitly, the exponent for the power function is 10.0
    */
  type PowerScaling = XScaling
  /** @since LibreOffice 4.1 */
  type RegressionEquation = XPropertySet
  /** stateless service */
  type Scaling = XScaling
  type XChartTypeManager = XInterface
  /** interface for the legend of a diagram */
  type XLegend = XInterface
}
