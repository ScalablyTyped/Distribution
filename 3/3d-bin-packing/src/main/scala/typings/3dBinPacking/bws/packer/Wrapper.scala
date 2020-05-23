package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper wrapping instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityDeque<Wrap> * / any */ trait Wrapper extends Instance {
  @JSName("$height")
  var $height: String
  @JSName("$length")
  var $length: String
  @JSName("$name")
  var $name: String
  @JSName("$price")
  var $price: String
  @JSName("$scale")
  val $scale: String
  @JSName("$spaceUtilization")
  val $spaceUtilization: String
  @JSName("$thickness")
  var $thickness: String
  @JSName("$width")
  var $width: String
  /**
    * Height of the Wrapper, length on the Y-axis in 3D.
    */
  var height: Double
  /**
    * Length of the Wrapper, length on the Z-axis in 3D.
    */
  var length: Double
  /**
    * <p> Name, key of the Wrapper. </p>
    *
    * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
    */
  var name: String
  /**
    * Price, cost of using an Wrapper.
    */
  var price: Double
  /**
    * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
    *
    * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
    * so finally, it reduces total containable volume (-8 * thickness^3). </p>
    */
  var thickness: Double
  /**
    * Width of the Wrapper, length on the X-axis in 3D.
    */
  var width: Double
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String
  /**
    * @inheritdoc
    */
  def TAG(): String
  /**
    * <p> Wrapper is enough greater? </p>
    *
    * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
    *
    * @param instance An Instance to test.
    * @return Enough greater or not.
    */
  def containable(instance: Instance): Boolean
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrap
  def equals(obj: Wrapper): Boolean
  /**
    * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
    *
    * <p> Calculates containable height considering the {@link thickness}. </p>
    *
    * @return height - (2 x thickness)
    */
  def getContainableHeight(): Double
  /**
    * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
    *
    * <p> Calculates containable length considering the {@link thickness}. </p>
    *
    * @return length - (2 x thickness)
    */
  def getContainableLength(): Double
  /**
    * <p> Get (calculate) containable volume. </p>
    *
    * <p> Calculates containable volume considering the {@link thickness}. </p>
    *
    * @return volume - {(2 x thickness) ^ 3}
    */
  def getContainableVolume(): Double
  /**
    * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
    *
    * <p> Calculates containable width considering the {@link thickness}. </p>
    *
    * @return width - (2 x thickness)
    */
  def getContainableWidth(): Double
  /**
    * Get price.
    */
  def getPrice(): Double
  /**
    * Get thickness.
    */
  def getThickness(): Double
  /**
    * Get utilization ratio of containable volume.
    *
    * @return utilization ratio.
    */
  def getUtilization(): Double
  /**
    * Key of a Wrapper is its name.
    */
  def key(): js.Any
  /**
    * Set price.
    */
  def setPrice(`val`: Double): Unit
  /**
    * Set thickness.
    */
  def setThickness(`val`: Double): Unit
  /**
    * @inheritdoc
    */
  def toXML(): js.Any
}

object Wrapper {
  @scala.inline
  def apply(
    $height: String,
    $length: String,
    $name: String,
    $price: String,
    $scale: String,
    $spaceUtilization: String,
    $thickness: String,
    $width: String,
    CHILD_TAG: () => String,
    TAG: () => String,
    TYPE: () => String,
    containable: Instance => Boolean,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap,
    equals: Wrapper => Boolean,
    getContainableHeight: () => Double,
    getContainableLength: () => Double,
    getContainableVolume: () => Double,
    getContainableWidth: () => Double,
    getHeight: () => Double,
    getLength: () => Double,
    getName: () => String,
    getPrice: () => Double,
    getThickness: () => Double,
    getUtilization: () => Double,
    getVolume: () => Double,
    getWidth: () => Double,
    height: Double,
    key: () => js.Any,
    length: Double,
    name: String,
    price: Double,
    setHeight: Double => Unit,
    setLength: Double => Unit,
    setName: String => Unit,
    setPrice: Double => Unit,
    setThickness: Double => Unit,
    setWidth: Double => Unit,
    thickness: Double,
    toXML: () => js.Any,
    width: Double
  ): Wrapper = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $price = $price.asInstanceOf[js.Any], $scale = $scale.asInstanceOf[js.Any], $spaceUtilization = $spaceUtilization.asInstanceOf[js.Any], $thickness = $thickness.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), TYPE = js.Any.fromFunction0(TYPE), containable = js.Any.fromFunction1(containable), createChild = js.Any.fromFunction1(createChild), equals = js.Any.fromFunction1(equals), getContainableHeight = js.Any.fromFunction0(getContainableHeight), getContainableLength = js.Any.fromFunction0(getContainableLength), getContainableVolume = js.Any.fromFunction0(getContainableVolume), getContainableWidth = js.Any.fromFunction0(getContainableWidth), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPrice = js.Any.fromFunction0(getPrice), getThickness = js.Any.fromFunction0(getThickness), getUtilization = js.Any.fromFunction0(getUtilization), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setPrice = js.Any.fromFunction1(setPrice), setThickness = js.Any.fromFunction1(setThickness), setWidth = js.Any.fromFunction1(setWidth), thickness = thickness.asInstanceOf[js.Any], toXML = js.Any.fromFunction0(toXML), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
}

