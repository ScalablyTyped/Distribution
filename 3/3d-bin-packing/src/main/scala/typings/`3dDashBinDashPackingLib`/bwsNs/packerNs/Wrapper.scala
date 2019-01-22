package typings
package `3dDashBinDashPackingLib`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper wrapping instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("bws.packer.Wrapper")
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
  def this(name: java.lang.String, price: scala.Double, width: scala.Double, height: scala.Double, length: scala.Double, thickness: scala.Double) = this()
  @JSName("$height")
  var $height: java.lang.String = js.native
  @JSName("$length")
  var $length: java.lang.String = js.native
  @JSName("$name")
  var $name: java.lang.String = js.native
  @JSName("$price")
  var $price: java.lang.String = js.native
  @JSName("$scale")
  val $scale: java.lang.String = js.native
  @JSName("$spaceUtilization")
  val $spaceUtilization: java.lang.String = js.native
  @JSName("$thickness")
  var $thickness: java.lang.String = js.native
  @JSName("$width")
  var $width: java.lang.String = js.native
  /**
    * Height of the Wrapper, length on the Y-axis in 3D.
    */
  var height: scala.Double = js.native
  /**
    * Length of the Wrapper, length on the Z-axis in 3D.
    */
  var length: scala.Double = js.native
  /**
    * <p> Name, key of the Wrapper. </p>
    *
    * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
    */
  var name: java.lang.String = js.native
  /**
    * Price, cost of using an Wrapper.
    */
  var price: scala.Double = js.native
  /**
    * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
    *
    * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
    * so finally, it reduces total containable volume (-8 * thickness^3). </p>
    */
  var thickness: scala.Double = js.native
  /**
    * Width of the Wrapper, length on the X-axis in 3D.
    */
  var width: scala.Double = js.native
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): java.lang.String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): java.lang.String = js.native
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
  override def TYPE(): java.lang.String = js.native
  /**
    * <p> Wrapper is enough greater? </p>
    *
    * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
    *
    * @param instance An Instance to test.
    * @return Enough greater or not.
    */
  def containable(instance: Instance): scala.Boolean = js.native
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrap = js.native
  def equals(obj: Wrapper): scala.Boolean = js.native
  /**
    * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
    *
    * <p> Calculates containable height considering the {@link thickness}. </p>
    *
    * @return height - (2 x thickness)
    */
  def getContainableHeight(): scala.Double = js.native
  /**
    * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
    *
    * <p> Calculates containable length considering the {@link thickness}. </p>
    *
    * @return length - (2 x thickness)
    */
  def getContainableLength(): scala.Double = js.native
  /**
    * <p> Get (calculate) containable volume. </p>
    *
    * <p> Calculates containable volume considering the {@link thickness}. </p>
    *
    * @return volume - {(2 x thickness) ^ 3}
    */
  def getContainableVolume(): scala.Double = js.native
  /**
    * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
    *
    * <p> Calculates containable width considering the {@link thickness}. </p>
    *
    * @return width - (2 x thickness)
    */
  def getContainableWidth(): scala.Double = js.native
  /**
    * Get height, length on the Y-axis in 3D.
    */
  /* CompleteClass */
  override def getHeight(): scala.Double = js.native
  /**
    * Get length, length on the Z-axis in 3D.
    */
  /* CompleteClass */
  override def getLength(): scala.Double = js.native
  /**
    * Get name.
    */
  /* CompleteClass */
  override def getName(): java.lang.String = js.native
  /**
    * Get price.
    */
  def getPrice(): scala.Double = js.native
  /**
    * Get thickness.
    */
  def getThickness(): scala.Double = js.native
  /**
    * Get utilization ratio of containable volume.
    *
    * @return utilization ratio.
    */
  def getUtilization(): scala.Double = js.native
  /**
    * Get (calculate) volume.
    *
    * @return width x height x length
    */
  /* CompleteClass */
  override def getVolume(): scala.Double = js.native
  /**
    * Get width, length on the X-axis in 3D.
    */
  /* CompleteClass */
  override def getWidth(): scala.Double = js.native
  /**
    * Key of a Wrapper is its name.
    */
  def key(): js.Any = js.native
  /**
    * Set height, length on the Y-axis in 3D.
    */
  /* CompleteClass */
  override def setHeight(`val`: scala.Double): scala.Unit = js.native
  /**
    * Set length, length on the Z-axis in 3D.
    */
  /* CompleteClass */
  override def setLength(`val`: scala.Double): scala.Unit = js.native
  /**
    * Set name.
    */
  /* CompleteClass */
  override def setName(`val`: java.lang.String): scala.Unit = js.native
  /**
    * Set price.
    */
  def setPrice(`val`: scala.Double): scala.Unit = js.native
  /**
    * Set thickness.
    */
  def setThickness(`val`: scala.Double): scala.Unit = js.native
  /**
    * Set width, length on the X-axis in 3D.
    */
  /* CompleteClass */
  override def setWidth(`val`: scala.Double): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

