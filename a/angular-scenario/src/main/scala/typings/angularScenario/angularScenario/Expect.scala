package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expect extends Matchers {
  def not(): CustomMatchers = js.native
}

object Expect {
  @scala.inline
  def apply(
    not: () => CustomMatchers,
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
  ): Expect = {
    val __obj = js.Dynamic.literal(not = js.Any.fromFunction0(not), toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
    __obj.asInstanceOf[Expect]
  }
  @scala.inline
  implicit class ExpectOps[Self <: Expect] (val x: Self) extends AnyVal {
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
    def setNot(value: () => CustomMatchers): Self = this.set("not", js.Any.fromFunction0(value))
  }
  
}

