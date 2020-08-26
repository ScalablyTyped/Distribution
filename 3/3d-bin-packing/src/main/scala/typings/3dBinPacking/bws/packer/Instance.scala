package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface of physical 3D-instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.IEntity * / any */ @js.native
trait Instance extends js.Object {
  /**
    * <p> A type, identifier of derived class. </p>
    *
    * <h4> Derived types </h4>
    * <ul>
    *	<li> {@link Product product} </li>
    *	<li> {@link Wrapper wrapper} </li>
    * <ul>
    */
  def TYPE(): String = js.native
  /**
    * Get height, length on the Y-axis in 3D.
    */
  def getHeight(): Double = js.native
  /**
    * Get length, length on the Z-axis in 3D.
    */
  def getLength(): Double = js.native
  /**
    * Get name.
    */
  def getName(): String = js.native
  /**
    * Get (calculate) volume.
    *
    * @return width x height x length
    */
  def getVolume(): Double = js.native
  /**
    * Get width, length on the X-axis in 3D.
    */
  def getWidth(): Double = js.native
  /**
    * Set height, length on the Y-axis in 3D.
    */
  def setHeight(`val`: Double): Unit = js.native
  /**
    * Set length, length on the Z-axis in 3D.
    */
  def setLength(`val`: Double): Unit = js.native
  /**
    * Set name.
    */
  def setName(`val`: String): Unit = js.native
  /**
    * Set width, length on the X-axis in 3D.
    */
  def setWidth(`val`: Double): Unit = js.native
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
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setTYPE(value: () => String): Self = this.set("TYPE", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVolume(value: () => Double): Self = this.set("getVolume", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLength(value: Double => Unit): Self = this.set("setLength", js.Any.fromFunction1(value))
    @scala.inline
    def setSetName(value: String => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
  }
  
}

