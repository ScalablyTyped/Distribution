package typings.angularLoadingBar.mod.angularAugmentingMod.loadingBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadingBarProvider extends js.Object {
  /**
    * Give illusion that there's always progress
    */
  var autoIncrement: js.UndefOr[Boolean] = js.native
  /**
    * Turn the loading bar on or off
    */
  var includeBar: js.UndefOr[Boolean] = js.native
  /**
    * Turn the spinner on or off
    */
  var includeSpinner: js.UndefOr[Boolean] = js.native
  /**
    * Latency Threshold
    */
  var latencyThreshold: js.UndefOr[Double] = js.native
  /**
    * Loading bar template
    */
  var loadingBarTemplate: js.UndefOr[String] = js.native
  /**
    * HTML element selector of parent
    */
  var parentSelector: js.UndefOr[String] = js.native
  /**
    * HTML template
    */
  var spinnerTemplate: js.UndefOr[String] = js.native
  /**
    * Starting size
    */
  var startSize: js.UndefOr[Double] = js.native
  /**
    * Complete the loading bar
    */
  def complete(): Unit = js.native
  /**
    * Increment the loading bar
    */
  def inc(): Unit = js.native
  /**
    * Set the percentage completed
    * @param {number} n - number between 0 and 1
    */
  def set(n: Double): Unit = js.native
  /**
    * Broadcast the start event
    */
  def start(): Unit = js.native
  /**
    * Get the percentage completed
    * @returns {number}
    */
  def status(): Double = js.native
}

object ILoadingBarProvider {
  @scala.inline
  def apply(
    complete: () => Unit,
    inc: () => Unit,
    set: Double => Unit,
    start: () => Unit,
    status: () => Double
  ): ILoadingBarProvider = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), inc = js.Any.fromFunction0(inc), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status))
    __obj.asInstanceOf[ILoadingBarProvider]
  }
  @scala.inline
  implicit class ILoadingBarProviderOps[Self <: ILoadingBarProvider] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def setInc(value: () => Unit): Self = this.set("inc", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: Double => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: () => Double): Self = this.set("status", js.Any.fromFunction0(value))
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    @scala.inline
    def setIncludeBar(value: Boolean): Self = this.set("includeBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeBar: Self = this.set("includeBar", js.undefined)
    @scala.inline
    def setIncludeSpinner(value: Boolean): Self = this.set("includeSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSpinner: Self = this.set("includeSpinner", js.undefined)
    @scala.inline
    def setLatencyThreshold(value: Double): Self = this.set("latencyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatencyThreshold: Self = this.set("latencyThreshold", js.undefined)
    @scala.inline
    def setLoadingBarTemplate(value: String): Self = this.set("loadingBarTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingBarTemplate: Self = this.set("loadingBarTemplate", js.undefined)
    @scala.inline
    def setParentSelector(value: String): Self = this.set("parentSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentSelector: Self = this.set("parentSelector", js.undefined)
    @scala.inline
    def setSpinnerTemplate(value: String): Self = this.set("spinnerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinnerTemplate: Self = this.set("spinnerTemplate", js.undefined)
    @scala.inline
    def setStartSize(value: Double): Self = this.set("startSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartSize: Self = this.set("startSize", js.undefined)
  }
  
}

