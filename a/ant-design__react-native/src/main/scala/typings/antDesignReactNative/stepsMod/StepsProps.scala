package typings.antDesignReactNative.stepsMod

import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.vertical
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.stepsStyleMod.StepsStyle
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsProps extends WithThemeStyles[StepsStyle] {
  var children: js.Array[ReactElement] = js.native
  var current: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[vertical | horizontal] = js.native
  var finishIcon: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
}

object StepsProps {
  @scala.inline
  def apply(children: js.Array[ReactElement]): StepsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
  @scala.inline
  implicit class StepsPropsOps[Self <: StepsProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFinishIcon(value: String): Self = this.set("finishIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishIcon: Self = this.set("finishIcon", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

