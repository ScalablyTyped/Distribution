package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows the transformation of numeric values from one coordinate-system into an other. Values may be transformed using any mapping. */
trait XTransformation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** the dimension of the input coordinate sequence that is to be transformed by the {@link transform()} method. */
  val SourceDimension: scala.Double
  /** the dimension of the output coordinate sequence that is the result of the {@link transform()} method. */
  val TargetDimension: scala.Double
  /** the dimension of the input coordinate sequence that is to be transformed by the {@link transform()} method. */
  def getSourceDimension(): scala.Double
  /** the dimension of the output coordinate sequence that is the result of the {@link transform()} method. */
  def getTargetDimension(): scala.Double
  /**
    * transforms the given input data tuple, given in the source coordinate system, according to the internal transformation rules, into a tuple of
    * transformed coordinates in the destination coordinate system.
    *
    * Note that both coordinate systems may have different dimensions, e.g., if a transformation does simply a projection into a lower-dimensional space.
    * @param aValues a source tuple of data that is to be transformed. The length of this sequence must be equivalent to the dimension of the source coordinat
    * @returns the transformed data tuple. The length of this sequence is equal to the dimension of the output coordinate system.
    * @throws com::sun::star::lang::IllegalArgumentException if the dimension of the input vector is not equal to the dimension given in {@link getSourceDimens
    */
  def transform(aValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): stdLib.SafeArray[scala.Double]
}

object XTransformation {
  @scala.inline
  def apply(
    SourceDimension: scala.Double,
    TargetDimension: scala.Double,
    acquire: () => scala.Unit,
    getSourceDimension: () => scala.Double,
    getTargetDimension: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    transform: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => stdLib.SafeArray[scala.Double]
  ): XTransformation = {
    val __obj = js.Dynamic.literal(SourceDimension = SourceDimension, TargetDimension = TargetDimension, acquire = js.Any.fromFunction0(acquire), getSourceDimension = js.Any.fromFunction0(getSourceDimension), getTargetDimension = js.Any.fromFunction0(getTargetDimension), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transform = js.Any.fromFunction1(transform))
  
    __obj.asInstanceOf[XTransformation]
  }
}

