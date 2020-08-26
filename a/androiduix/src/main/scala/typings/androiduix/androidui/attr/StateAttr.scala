package typings.androiduix.androidui.attr

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateAttr extends js.Object {
  var attributes: js.Any = js.native
  var stateSpec: js.Any = js.native
  def createDiffKeyAsNullValueAttrMap(another: StateAttr): Map[String, String] = js.native
  def getAttrMap(): Map[String, String] = js.native
  def hasAttr(name: String): Boolean = js.native
  def isDefaultState(): Boolean = js.native
  def isStateEquals(state: js.Array[Double]): Boolean = js.native
  def isStateMatch(state: js.Array[Double]): Boolean = js.native
  def putAll(stateAttr: StateAttr): Unit = js.native
  def setAttr(name: String, value: String): Unit = js.native
}

object StateAttr {
  @scala.inline
  def apply(
    attributes: js.Any,
    createDiffKeyAsNullValueAttrMap: StateAttr => Map[String, String],
    getAttrMap: () => Map[String, String],
    hasAttr: String => Boolean,
    isDefaultState: () => Boolean,
    isStateEquals: js.Array[Double] => Boolean,
    isStateMatch: js.Array[Double] => Boolean,
    putAll: StateAttr => Unit,
    setAttr: (String, String) => Unit,
    stateSpec: js.Any
  ): StateAttr = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createDiffKeyAsNullValueAttrMap = js.Any.fromFunction1(createDiffKeyAsNullValueAttrMap), getAttrMap = js.Any.fromFunction0(getAttrMap), hasAttr = js.Any.fromFunction1(hasAttr), isDefaultState = js.Any.fromFunction0(isDefaultState), isStateEquals = js.Any.fromFunction1(isStateEquals), isStateMatch = js.Any.fromFunction1(isStateMatch), putAll = js.Any.fromFunction1(putAll), setAttr = js.Any.fromFunction2(setAttr), stateSpec = stateSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateAttr]
  }
  @scala.inline
  implicit class StateAttrOps[Self <: StateAttr] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDiffKeyAsNullValueAttrMap(value: StateAttr => Map[String, String]): Self = this.set("createDiffKeyAsNullValueAttrMap", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAttrMap(value: () => Map[String, String]): Self = this.set("getAttrMap", js.Any.fromFunction0(value))
    @scala.inline
    def setHasAttr(value: String => Boolean): Self = this.set("hasAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDefaultState(value: () => Boolean): Self = this.set("isDefaultState", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStateEquals(value: js.Array[Double] => Boolean): Self = this.set("isStateEquals", js.Any.fromFunction1(value))
    @scala.inline
    def setIsStateMatch(value: js.Array[Double] => Boolean): Self = this.set("isStateMatch", js.Any.fromFunction1(value))
    @scala.inline
    def setPutAll(value: StateAttr => Unit): Self = this.set("putAll", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttr(value: (String, String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    @scala.inline
    def setStateSpec(value: js.Any): Self = this.set("stateSpec", value.asInstanceOf[js.Any])
  }
  
}

