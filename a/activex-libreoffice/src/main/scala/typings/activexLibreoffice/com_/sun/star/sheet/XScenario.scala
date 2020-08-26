package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
@js.native
trait XScenario extends XInterface {
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: Boolean = js.native
  /** returns the comment for the scenario. */
  var ScenarioComment: String = js.native
  /** adds more ranges to the scenario. */
  def addRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit = js.native
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): Unit = js.native
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): Boolean = js.native
  /** returns the comment for the scenario. */
  def getScenarioComment(): String = js.native
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: String): Unit = js.native
}

object XScenario {
  @scala.inline
  def apply(
    IsScenario: Boolean,
    ScenarioComment: String,
    acquire: () => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getScenarioComment: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScenarioComment: String => Unit
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRanges = js.Any.fromFunction1(addRanges), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
    __obj.asInstanceOf[XScenario]
  }
  @scala.inline
  implicit class XScenarioOps[Self <: XScenario] (val x: Self) extends AnyVal {
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
    def setIsScenario(value: Boolean): Self = this.set("IsScenario", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenarioComment(value: String): Self = this.set("ScenarioComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddRanges(value: SeqEquiv[CellRangeAddress] => Unit): Self = this.set("addRanges", js.Any.fromFunction1(value))
    @scala.inline
    def setApply(value: () => Unit): Self = this.set("apply", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsScenario(value: () => Boolean): Self = this.set("getIsScenario", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScenarioComment(value: () => String): Self = this.set("getScenarioComment", js.Any.fromFunction0(value))
    @scala.inline
    def setSetScenarioComment(value: String => Unit): Self = this.set("setScenarioComment", js.Any.fromFunction1(value))
  }
  
}

