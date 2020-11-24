package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows the transformation of numeric values from one coordinate-system into an other. Values may be transformed using any mapping. */
@js.native
trait XTransformation extends XInterface {
  
  /** the dimension of the input coordinate sequence that is to be transformed by the {@link transform()} method. */
  val SourceDimension: Double = js.native
  
  /** the dimension of the output coordinate sequence that is the result of the {@link transform()} method. */
  val TargetDimension: Double = js.native
  
  /** the dimension of the input coordinate sequence that is to be transformed by the {@link transform()} method. */
  def getSourceDimension(): Double = js.native
  
  /** the dimension of the output coordinate sequence that is the result of the {@link transform()} method. */
  def getTargetDimension(): Double = js.native
  
  /**
    * transforms the given input data tuple, given in the source coordinate system, according to the internal transformation rules, into a tuple of
    * transformed coordinates in the destination coordinate system.
    *
    * Note that both coordinate systems may have different dimensions, e.g., if a transformation does simply a projection into a lower-dimensional space.
    * @param aValues a source tuple of data that is to be transformed. The length of this sequence must be equivalent to the dimension of the source coordinat
    * @returns the transformed data tuple. The length of this sequence is equal to the dimension of the output coordinate system.
    * @throws com::sun::star::lang::IllegalArgumentException if the dimension of the input vector is not equal to the dimension given in {@link getSourceDimens
    */
  def transform(aValues: SeqEquiv[Double]): SafeArray[Double] = js.native
}
object XTransformation {
  
  @scala.inline
  def apply(
    SourceDimension: Double,
    TargetDimension: Double,
    acquire: () => Unit,
    getSourceDimension: () => Double,
    getTargetDimension: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    transform: SeqEquiv[Double] => SafeArray[Double]
  ): XTransformation = {
    val __obj = js.Dynamic.literal(SourceDimension = SourceDimension.asInstanceOf[js.Any], TargetDimension = TargetDimension.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSourceDimension = js.Any.fromFunction0(getSourceDimension), getTargetDimension = js.Any.fromFunction0(getTargetDimension), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[XTransformation]
  }
  
  @scala.inline
  implicit class XTransformationOps[Self <: XTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceDimension(value: Double): Self = this.set("SourceDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDimension(value: Double): Self = this.set("TargetDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSourceDimension(value: () => Double): Self = this.set("getSourceDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetDimension(value: () => Double): Self = this.set("getTargetDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransform(value: SeqEquiv[Double] => SafeArray[Double]): Self = this.set("transform", js.Any.fromFunction1(value))
  }
}
