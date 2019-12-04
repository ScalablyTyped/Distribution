package typings.`3dDashBinDashPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @JSGlobal("bws.packer.Product")
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
  def this(name: String, width: Double, height: Double, length: Double) = this()
  /**
    * Height of the Product, length on the Y-axis in 3D.
    */
  var height: Double = js.native
  /**
    * Length of the Product, length on the Z-axis in 3D.
    */
  var length: Double = js.native
  /**
    * <p> Name, key of the Product. </p>
    *
    * <p> The name must be unique because a name identifies a {@link Product}. </p>
    */
  var name: String = js.native
  /**
    * Width of the Product, length on the X-axis in 3D.
    */
  var width: Double = js.native
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
    * Key of a Product is its name.
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
    * Set width, length on the X-axis in 3D.
    */
  /* CompleteClass */
  override def setWidth(`val`: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

