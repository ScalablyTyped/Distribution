package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRegressionCurveCalculator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the value of the correlation coefficient for the given regression. This value is often denoted as **r** or **R** .
    *
    * The value of **r** is signed. Often **r**<sup>2</sup> is used instead of **r** to denote a regression curve's accuracy.
    * @returns The return value is the fraction of the variance in the data that is explained by the regression.
    */
  val CorrelationCoefficient: scala.Double
  /**
    * Retrieve a string showing the regression curve's function with calculated parameters.
    * @returns The string returned contains the regression curve's formula in a form `"f(x) = ..."` , where the calculated parts are filled out. For a linear re
    */
  val Representation: java.lang.String
  /**
    * Returns the value of the correlation coefficient for the given regression. This value is often denoted as **r** or **R** .
    *
    * The value of **r** is signed. Often **r**<sup>2</sup> is used instead of **r** to denote a regression curve's accuracy.
    * @returns The return value is the fraction of the variance in the data that is explained by the regression.
    */
  def getCorrelationCoefficient(): scala.Double
  /**
    * calculates the value of the regression curve for **x** .
    * @param x The abscissa value for which the value of the regression curve should be calculated. All numbers that are part of the domain of the regression
    * @returns If **x** is element of the domain of the regression curve function, the result is its value.
    * @throws com::sun::star::lang::IllegalArgumentException If **x** is not part of the domain of the regression function.
    */
  def getCurveValue(x: scala.Double): scala.Double
  /**
    * calculate multiple points of a regression curve at once. Note that this method may optimize the output by returning less points, e.g. for a line you
    * may get only two resulting points instead of nPointCount() points. This is only allowed if the parameter bMaySkipPointsInCalculation() is set to
    * `TRUE` .
    *
    * It is important that a renderer takes the scalings into account. When one of these parameters is unknown, no optimization must be done.
    * @param min the abscissa value for the starting point.
    * @param max the abscissa value for the ending point.
    * @param nPointCount the number of points to calculate.
    * @param bMaySkipPointsInCalculation determines whether it is allowed to skip points in the calculation. When this parameter is `TRUE` it is assumed that
    * @param xScalingX a scaling that is used for the values in x-direction
    * @param xScalingY a scaling that is used for the values in y-direction
    */
  def getCurveValues(
    min: scala.Double,
    max: scala.Double,
    nPointCount: scala.Double,
    xScalingX: XScaling,
    xScalingY: XScaling,
    bMaySkipPointsInCalculation: scala.Boolean
  ): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
  /**
    * Returns a representation using the given number format for formatting all numbers contained in the formula. Wrap equation to fit in nFormulaLength
    * characters
    * @see getRepresentation
    */
  def getFormattedRepresentation(
    xNumFmtSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier,
    nNumberFormatKey: scala.Double,
    nFormulaLength: scala.Double
  ): java.lang.String
  /**
    * Retrieve a string showing the regression curve's function with calculated parameters.
    * @returns The string returned contains the regression curve's formula in a form `"f(x) = ..."` , where the calculated parts are filled out. For a linear re
    */
  def getRepresentation(): java.lang.String
  /**
    * recalculates the parameters of the internal regression curve according to the **x** - and **y** -values given.
    * @param aXValues All x-values that represent the measurement points on which the regression is based
    * @param aYValues All y-values that represent the measurement points on which the regression is based
    */
  def recalculateRegression(
    aXValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    aYValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
  /**
    * set calculation properties for curve calculation.
    * @param degree Degree of polynomial regression curve, value should be greater than zero If the curve is not polynomial, this property has no effect.
    * @param period Period of a moving average regression curve, value should greater or equal to 2 If the curve is not moving average regression curve, this
    * @param forceIntercept Should force the intercept value.
    * @param interceptValue Intercept value.
    */
  def setRegressionProperties(
    degree: scala.Double,
    forceIntercept: scala.Boolean,
    interceptValue: scala.Double,
    period: scala.Double
  ): scala.Unit
  /**
    * Set the names of X and Y variables of the equation to replace "x" and "f(x)" in representation
    * @param aXName string of the name of X variable
    * @param aYName string of the name of Y variable
    */
  def setXYNames(aXName: java.lang.String, aYName: java.lang.String): scala.Unit
}

object XRegressionCurveCalculator {
  @scala.inline
  def apply(
    CorrelationCoefficient: scala.Double,
    Representation: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getCorrelationCoefficient: js.Function0[scala.Double],
    getCurveValue: js.Function1[scala.Double, scala.Double],
    getCurveValues: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      XScaling, 
      XScaling, 
      scala.Boolean, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
    ],
    getFormattedRepresentation: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier, 
      scala.Double, 
      scala.Double, 
      java.lang.String
    ],
    getRepresentation: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    recalculateRegression: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    setRegressionProperties: js.Function4[scala.Double, scala.Boolean, scala.Double, scala.Double, scala.Unit],
    setXYNames: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): XRegressionCurveCalculator = {
    val __obj = js.Dynamic.literal(CorrelationCoefficient = CorrelationCoefficient, Representation = Representation, acquire = acquire, getCorrelationCoefficient = getCorrelationCoefficient, getCurveValue = getCurveValue, getCurveValues = getCurveValues, getFormattedRepresentation = getFormattedRepresentation, getRepresentation = getRepresentation, queryInterface = queryInterface, recalculateRegression = recalculateRegression, release = release, setRegressionProperties = setRegressionProperties, setXYNames = setXYNames)
  
    __obj.asInstanceOf[XRegressionCurveCalculator]
  }
}

