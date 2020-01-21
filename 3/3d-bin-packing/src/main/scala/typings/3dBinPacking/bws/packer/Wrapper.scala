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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityDeque<Wrap> * / any */ @JSGlobal("bws.packer.Wrapper")
@js.native
/**
  * Default Constructor.
  */
class Wrapper () extends Instance {
  /**
    * Copy Constructor.
    */
  def this(wrapper: Wrapper) = this()
  /**
    * Construct from members.
    *
    * @param name Name, identifier of a Wrapper.
    * @param price Price, issued cost for a type of the Wrapper.
    * @param width Width, dimensional length on the X-axis in 3D.
    * @param height Height, dimensional length on the Y-axis in 3D.
    * @param length Length, dimensional length on the Z-axis in 3D.
    * @param thickness A thickness causes shrinkness on containable volume.
    */
  def this(name: String, price: Double, width: Double, height: Double, length: Double, thickness: Double) = this()
  @JSName("$height")
  var $height: String = js.native
  @JSName("$length")
  var $length: String = js.native
  @JSName("$name")
  var $name: String = js.native
  @JSName("$price")
  var $price: String = js.native
  @JSName("$scale")
  val $scale: String = js.native
  @JSName("$spaceUtilization")
  val $spaceUtilization: String = js.native
  @JSName("$thickness")
  var $thickness: String = js.native
  @JSName("$width")
  var $width: String = js.native
  /**
    * Height of the Wrapper, length on the Y-axis in 3D.
    */
  var height: Double = js.native
  /**
    * Length of the Wrapper, length on the Z-axis in 3D.
    */
  var length: Double = js.native
  /**
    * <p> Name, key of the Wrapper. </p>
    *
    * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
    */
  var name: String = js.native
  /**
    * Price, cost of using an Wrapper.
    */
  var price: Double = js.native
  /**
    * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
    *
    * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
    * so finally, it reduces total containable volume (-8 * thickness^3). </p>
    */
  var thickness: Double = js.native
  /**
    * Width of the Wrapper, length on the X-axis in 3D.
    */
  var width: Double = js.native
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * <p> A type, identifier of derived class. </p>
    *
    * <h4> Derived types </h4>
    * <ul>
    *	<li> {@link Product product} </li>
    *	<li> {@link Wrapper wrapper} </li>
    * <ul>
    */
  /* CompleteClass */
  override def TYPE(): String = js.native
  /**
    * <p> Wrapper is enough greater? </p>
    *
    * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
    *
    * @param instance An Instance to test.
    * @return Enough greater or not.
    */
  def containable(instance: Instance): Boolean = js.native
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrap = js.native
  def equals(obj: Wrapper): Boolean = js.native
  /**
    * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
    *
    * <p> Calculates containable height considering the {@link thickness}. </p>
    *
    * @return height - (2 x thickness)
    */
  def getContainableHeight(): Double = js.native
  /**
    * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
    *
    * <p> Calculates containable length considering the {@link thickness}. </p>
    *
    * @return length - (2 x thickness)
    */
  def getContainableLength(): Double = js.native
  /**
    * <p> Get (calculate) containable volume. </p>
    *
    * <p> Calculates containable volume considering the {@link thickness}. </p>
    *
    * @return volume - {(2 x thickness) ^ 3}
    */
  def getContainableVolume(): Double = js.native
  /**
    * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
    *
    * <p> Calculates containable width considering the {@link thickness}. </p>
    *
    * @return width - (2 x thickness)
    */
  def getContainableWidth(): Double = js.native
  /**
    * Get height, length on the Y-axis in 3D.
    */
  /* CompleteClass */
  override def getHeight(): Double = js.native
  /**
    * Get length, length on the Z-axis in 3D.
    */
  /* CompleteClass */
  override def getLength(): Double = js.native
  /**
    * Get name.
    */
  /* CompleteClass */
  override def getName(): String = js.native
  /**
    * Get price.
    */
  def getPrice(): Double = js.native
  /**
    * Get thickness.
    */
  def getThickness(): Double = js.native
  /**
    * Get utilization ratio of containable volume.
    *
    * @return utilization ratio.
    */
  def getUtilization(): Double = js.native
  /**
    * Get (calculate) volume.
    *
    * @return width x height x length
    */
  /* CompleteClass */
  override def getVolume(): Double = js.native
  /**
    * Get width, length on the X-axis in 3D.
    */
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /**
    * Key of a Wrapper is its name.
    */
  def key(): js.Any = js.native
  /**
    * Set height, length on the Y-axis in 3D.
    */
  /* CompleteClass */
  override def setHeight(`val`: Double): Unit = js.native
  /**
    * Set length, length on the Z-axis in 3D.
    */
  /* CompleteClass */
  override def setLength(`val`: Double): Unit = js.native
  /**
    * Set name.
    */
  /* CompleteClass */
  override def setName(`val`: String): Unit = js.native
  /**
    * Set price.
    */
  def setPrice(`val`: Double): Unit = js.native
  /**
    * Set thickness.
    */
  def setThickness(`val`: Double): Unit = js.native
  /**
    * Set width, length on the X-axis in 3D.
    */
  /* CompleteClass */
  override def setWidth(`val`: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

