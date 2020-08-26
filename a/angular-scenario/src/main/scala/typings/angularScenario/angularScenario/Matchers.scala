package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers extends js.Object {
  def toBe(value: js.Any): Unit = js.native
  def toBeDefined(): Unit = js.native
  def toBeFalsy(): Unit = js.native
  def toBeGreaterThan(value: js.Any): Unit = js.native
  def toBeLessThan(value: js.Any): Unit = js.native
  def toBeNull(): Unit = js.native
  def toBeTruthy(): Unit = js.native
  def toContain(value: js.Any): Unit = js.native
  def toEqual(value: js.Any): Unit = js.native
  def toMatch(regularExpression: js.Any): Unit = js.native
}

object Matchers {
  @scala.inline
  def apply(
    toBe: js.Any => Unit,
    toBeDefined: () => Unit,
    toBeFalsy: () => Unit,
    toBeGreaterThan: js.Any => Unit,
    toBeLessThan: js.Any => Unit,
    toBeNull: () => Unit,
    toBeTruthy: () => Unit,
    toContain: js.Any => Unit,
    toEqual: js.Any => Unit,
    toMatch: js.Any => Unit
  ): Matchers = {
    val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
    __obj.asInstanceOf[Matchers]
  }
  @scala.inline
  implicit class MatchersOps[Self <: Matchers] (val x: Self) extends AnyVal {
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
    def setToBe(value: js.Any => Unit): Self = this.set("toBe", js.Any.fromFunction1(value))
    @scala.inline
    def setToBeDefined(value: () => Unit): Self = this.set("toBeDefined", js.Any.fromFunction0(value))
    @scala.inline
    def setToBeFalsy(value: () => Unit): Self = this.set("toBeFalsy", js.Any.fromFunction0(value))
    @scala.inline
    def setToBeGreaterThan(value: js.Any => Unit): Self = this.set("toBeGreaterThan", js.Any.fromFunction1(value))
    @scala.inline
    def setToBeLessThan(value: js.Any => Unit): Self = this.set("toBeLessThan", js.Any.fromFunction1(value))
    @scala.inline
    def setToBeNull(value: () => Unit): Self = this.set("toBeNull", js.Any.fromFunction0(value))
    @scala.inline
    def setToBeTruthy(value: () => Unit): Self = this.set("toBeTruthy", js.Any.fromFunction0(value))
    @scala.inline
    def setToContain(value: js.Any => Unit): Self = this.set("toContain", js.Any.fromFunction1(value))
    @scala.inline
    def setToEqual(value: js.Any => Unit): Self = this.set("toEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setToMatch(value: js.Any => Unit): Self = this.set("toMatch", js.Any.fromFunction1(value))
  }
  
}

