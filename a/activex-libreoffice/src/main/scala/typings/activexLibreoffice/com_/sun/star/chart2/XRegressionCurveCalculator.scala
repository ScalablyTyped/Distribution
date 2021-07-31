package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRegressionCurveCalculator
  extends StObject
     with XInterface {
  
  /**
    * Returns the value of the correlation coefficient for the given regression. This value is often denoted as **r** or **R** .
    *
    * The value of **r** is signed. Often **r**<sup>2</sup> is used instead of **r** to denote a regression curve's accuracy.
    * @returns The return value is the fraction of the variance in the data that is explained by the regression.
    */
  val CorrelationCoefficient: Double
  
  /**
    * Retrieve a string showing the regression curve's function with calculated parameters.
    * @returns The string returned contains the regression curve's formula in a form `"f(x) = ..."` , where the calculated parts are filled out. For a linear re
    */
  val Representation: String
  
  /**
    * Returns the value of the correlation coefficient for the given regression. This value is often denoted as **r** or **R** .
    *
    * The value of **r** is signed. Often **r**<sup>2</sup> is used instead of **r** to denote a regression curve's accuracy.
    * @returns The return value is the fraction of the variance in the data that is explained by the regression.
    */
  def getCorrelationCoefficient(): Double
  
  /**
    * calculates the value of the regression curve for **x** .
    * @param x The abscissa value for which the value of the regression curve should be calculated. All numbers that are part of the domain of the regression
    * @returns If **x** is element of the domain of the regression curve function, the result is its value.
    * @throws com::sun::star::lang::IllegalArgumentException If **x** is not part of the domain of the regression function.
    */
  def getCurveValue(x: Double): Double
  
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
    min: Double,
    max: Double,
    nPointCount: Double,
    xScalingX: XScaling,
    xScalingY: XScaling,
    bMaySkipPointsInCalculation: Boolean
  ): SafeArray[RealPoint2D]
  
  /**
    * Returns a representation using the given number format for formatting all numbers contained in the formula. Wrap equation to fit in nFormulaLength
    * characters
    * @see getRepresentation
    */
  def getFormattedRepresentation(xNumFmtSupplier: XNumberFormatsSupplier, nNumberFormatKey: Double, nFormulaLength: Double): String
  
  /**
    * Retrieve a string showing the regression curve's function with calculated parameters.
    * @returns The string returned contains the regression curve's formula in a form `"f(x) = ..."` , where the calculated parts are filled out. For a linear re
    */
  def getRepresentation(): String
  
  /**
    * recalculates the parameters of the internal regression curve according to the **x** - and **y** -values given.
    * @param aXValues All x-values that represent the measurement points on which the regression is based
    * @param aYValues All y-values that represent the measurement points on which the regression is based
    */
  def recalculateRegression(aXValues: SeqEquiv[Double], aYValues: SeqEquiv[Double]): Unit
  
  /**
    * set calculation properties for curve calculation.
    * @param degree Degree of polynomial regression curve, value should be greater than zero If the curve is not polynomial, this property has no effect.
    * @param period Period of a moving average regression curve, value should greater or equal to 2 If the curve is not moving average regression curve, this
    * @param forceIntercept Should force the intercept value.
    * @param interceptValue Intercept value.
    */
  def setRegressionProperties(degree: Double, forceIntercept: Boolean, interceptValue: Double, period: Double): Unit
  
  /**
    * Set the names of X and Y variables of the equation to replace "x" and "f(x)" in representation
    * @param aXName string of the name of X variable
    * @param aYName string of the name of Y variable
    */
  def setXYNames(aXName: String, aYName: String): Unit
}
object XRegressionCurveCalculator {
  
  @scala.inline
  def apply(
    CorrelationCoefficient: Double,
    Representation: String,
    acquire: () => Unit,
    getCorrelationCoefficient: () => Double,
    getCurveValue: Double => Double,
    getCurveValues: (Double, Double, Double, XScaling, XScaling, Boolean) => SafeArray[RealPoint2D],
    getFormattedRepresentation: (XNumberFormatsSupplier, Double, Double) => String,
    getRepresentation: () => String,
    queryInterface: `type` => js.Any,
    recalculateRegression: (SeqEquiv[Double], SeqEquiv[Double]) => Unit,
    release: () => Unit,
    setRegressionProperties: (Double, Boolean, Double, Double) => Unit,
    setXYNames: (String, String) => Unit
  ): XRegressionCurveCalculator = {
    val __obj = js.Dynamic.literal(CorrelationCoefficient = CorrelationCoefficient.asInstanceOf[js.Any], Representation = Representation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCorrelationCoefficient = js.Any.fromFunction0(getCorrelationCoefficient), getCurveValue = js.Any.fromFunction1(getCurveValue), getCurveValues = js.Any.fromFunction6(getCurveValues), getFormattedRepresentation = js.Any.fromFunction3(getFormattedRepresentation), getRepresentation = js.Any.fromFunction0(getRepresentation), queryInterface = js.Any.fromFunction1(queryInterface), recalculateRegression = js.Any.fromFunction2(recalculateRegression), release = js.Any.fromFunction0(release), setRegressionProperties = js.Any.fromFunction4(setRegressionProperties), setXYNames = js.Any.fromFunction2(setXYNames))
    __obj.asInstanceOf[XRegressionCurveCalculator]
  }
  
  @scala.inline
  implicit class XRegressionCurveCalculatorMutableBuilder[Self <: XRegressionCurveCalculator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationCoefficient(value: Double): Self = StObject.set(x, "CorrelationCoefficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCorrelationCoefficient(value: () => Double): Self = StObject.set(x, "getCorrelationCoefficient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurveValue(value: Double => Double): Self = StObject.set(x, "getCurveValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurveValues(value: (Double, Double, Double, XScaling, XScaling, Boolean) => SafeArray[RealPoint2D]): Self = StObject.set(x, "getCurveValues", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetFormattedRepresentation(value: (XNumberFormatsSupplier, Double, Double) => String): Self = StObject.set(x, "getFormattedRepresentation", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRepresentation(value: () => String): Self = StObject.set(x, "getRepresentation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecalculateRegression(value: (SeqEquiv[Double], SeqEquiv[Double]) => Unit): Self = StObject.set(x, "recalculateRegression", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRepresentation(value: String): Self = StObject.set(x, "Representation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRegressionProperties(value: (Double, Boolean, Double, Double) => Unit): Self = StObject.set(x, "setRegressionProperties", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetXYNames(value: (String, String) => Unit): Self = StObject.set(x, "setXYNames", js.Any.fromFunction2(value))
  }
}
