package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect extends Matchers {
  def not(): CustomMatchers
}

object Expect {
  @scala.inline
  def apply(
    not: () => CustomMatchers,
    toBe: js.Any => scala.Unit,
    toBeDefined: () => scala.Unit,
    toBeFalsy: () => scala.Unit,
    toBeGreaterThan: js.Any => scala.Unit,
    toBeLessThan: js.Any => scala.Unit,
    toBeNull: () => scala.Unit,
    toBeTruthy: () => scala.Unit,
    toContain: js.Any => scala.Unit,
    toEqual: js.Any => scala.Unit,
    toMatch: js.Any => scala.Unit
  ): Expect = {
    val __obj = js.Dynamic.literal(not = js.Any.fromFunction0(not), toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
  
    __obj.asInstanceOf[Expect]
  }
}

