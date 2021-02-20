package typings.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object chart2 {
  
  /** @since LibreOffice 4.1 */
  type CartesianCoordinateSystem2d = typings.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  
  /** @since LibreOffice 4.1 */
  type CartesianCoordinateSystem3d = typings.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  
  /** A factory for creating ChartTypeTemplates. */
  type ChartTypeManager = typings.activexLibreoffice.com_.sun.star.lang.MultiServiceFactory
  
  type ChartTypeTemplate = typings.activexLibreoffice.com_.sun.star.chart2.XChartTypeTemplate
  
  /**
    * The service {@link CoordinateSystemType} represents a special type of coordinate system. For example a 2 dimensional Cartesian coordinate system is a
    * {@link CoordinateSystemType} and different from for example a 3 dimensional spherical coordinate system.
    *
    * A {@link CoordinateSystemType} is a stateless service which has no owner and does not enable cyclic references, thus its lifetime can be handled by
    * reference or it may be implemented as a singleton.
    */
  type CoordinateSystemType = js.Any
  
  type CoordinateSystemTypeID = java.lang.String
  
  /** @since LibreOffice 4.1 */
  type ExponentialRegressionCurve = typings.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  
  /**
    * {@link Scaling} that scales a value **x** by taking the power of the base to **x** .
    *
    * If not mentioned explicitly, the base for the power function is 10.0
    */
  type ExponentialScaling = typings.activexLibreoffice.com_.sun.star.chart2.XScaling
  
  type FormattedString = typings.activexLibreoffice.com_.sun.star.chart2.XFormattedString2
  
  /** @since LibreOffice 4.1 */
  type LinearRegressionCurve = typings.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  
  /**
    * {@link Scaling} that scales a value **x** by calculating **m  x + t** .
    *
    * If not mentioned explicitly, the parameter **m** is 1.0 and **t** is 0.0, which means the transformation is an identical mapping.
    */
  type LinearScaling = typings.activexLibreoffice.com_.sun.star.chart2.XScaling
  
  /** @since LibreOffice 4.1 */
  type LogarithmicRegressionCurve = typings.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  
  /**
    * {@link Scaling} that scales values by taking their logarithm.
    *
    * If not mentioned explicitly, the base for the logarithm is 10.0
    */
  type LogarithmicScaling = typings.activexLibreoffice.com_.sun.star.chart2.XScaling
  
  /** @since LibreOffice 4.1 */
  type MovingAverageRegressionCurve = typings.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  
  /** @since LibreOffice 4.1 */
  type PolarCoordinateSystem2d = typings.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  
  /** @since LibreOffice 4.1 */
  type PolarCoordinateSystem3d = typings.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  
  /** @since LibreOffice 4.1 */
  type PolynomialRegressionCurve = typings.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  
  /** @since LibreOffice 4.1 */
  type PotentialRegressionCurve = typings.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  
  /**
    * {@link Scaling} that scales a value **x** by taking the power of **x** to the exponent.
    *
    * If not mentioned explicitly, the exponent for the power function is 10.0
    */
  type PowerScaling = typings.activexLibreoffice.com_.sun.star.chart2.XScaling
  
  /** @since LibreOffice 4.1 */
  type RegressionEquation = typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
  
  /** stateless service */
  type Scaling = typings.activexLibreoffice.com_.sun.star.chart2.XScaling
  
  type XChartTypeManager = typings.activexLibreoffice.com_.sun.star.uno.XInterface
  
  /** interface for the legend of a diagram */
  type XLegend = typings.activexLibreoffice.com_.sun.star.uno.XInterface
}
