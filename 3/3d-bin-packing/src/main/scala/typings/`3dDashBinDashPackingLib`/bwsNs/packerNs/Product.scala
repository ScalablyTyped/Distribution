package typings
package `3dDashBinDashPackingLib`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("bws.packer.Product")
@js.native
/**
  * Default Constructor.
  */
class Product () extends Instance {
  /**
    * Construct from members.
    *
    * @param name Name, identifier of the Product.
    * @param width Width, length on the X-axis in 3D.
    * @param height Height, length on the Y-axis in 3D.
    * @param length Length, length on the Z-axis in 3D.
    */
  def this(name: java.lang.String, width: scala.Double, height: scala.Double, length: scala.Double) = this()
  /**
    * Height of the Product, length on the Y-axis in 3D.
    */
  var height: scala.Double = js.native
  /**
    * Length of the Product, length on the Z-axis in 3D.
    */
  var length: scala.Double = js.native
  /**
    * <p> Name, key of the Product. </p>
    *
    * <p> The name must be unique because a name identifies a {@link Product}. </p>
    */
  var name: java.lang.String = js.native
  /**
    * Width of the Product, length on the X-axis in 3D.
    */
  var width: scala.Double = js.native
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
    * Key of a Product is its name.
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
    * Set width, length on the X-axis in 3D.
    */
  /* CompleteClass */
  override def setWidth(`val`: scala.Double): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

