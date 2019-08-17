package typings.`3dDashBinDashPacking`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface of physical 3D-instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify protocol.IEntity * / any */ trait Instance extends js.Object {
  /**
    * <p> A type, identifier of derived class. </p>
    *
    * <h4> Derived types </h4>
    * <ul>
    *	<li> {@link Product product} </li>
    *	<li> {@link Wrapper wrapper} </li>
    * <ul>
    */
  def TYPE(): String
  /**
    * Get height, length on the Y-axis in 3D.
    */
  def getHeight(): Double
  /**
    * Get length, length on the Z-axis in 3D.
    */
  def getLength(): Double
  /**
    * Get name.
    */
  def getName(): String
  /**
    * Get (calculate) volume.
    *
    * @return width x height x length
    */
  def getVolume(): Double
  /**
    * Get width, length on the X-axis in 3D.
    */
  def getWidth(): Double
  /**
    * Set height, length on the Y-axis in 3D.
    */
  def setHeight(`val`: Double): Unit
  /**
    * Set length, length on the Z-axis in 3D.
    */
  def setLength(`val`: Double): Unit
  /**
    * Set name.
    */
  def setName(`val`: String): Unit
  /**
    * Set width, length on the X-axis in 3D.
    */
  def setWidth(`val`: Double): Unit
}

object Instance {
  @scala.inline
  def apply(
    TYPE: () => String,
    getHeight: () => Double,
    getLength: () => Double,
    getName: () => String,
    getVolume: () => Double,
    getWidth: () => Double,
    setHeight: Double => Unit,
    setLength: Double => Unit,
    setName: String => Unit,
    setWidth: Double => Unit
  ): Instance = {
    val __obj = js.Dynamic.literal(TYPE = js.Any.fromFunction0(TYPE), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Instance]
  }
}

