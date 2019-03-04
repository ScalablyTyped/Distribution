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
    not: js.Function0[CustomMatchers],
    toBe: js.Function1[js.Any, scala.Unit],
    toBeDefined: js.Function0[scala.Unit],
    toBeFalsy: js.Function0[scala.Unit],
    toBeGreaterThan: js.Function1[js.Any, scala.Unit],
    toBeLessThan: js.Function1[js.Any, scala.Unit],
    toBeNull: js.Function0[scala.Unit],
    toBeTruthy: js.Function0[scala.Unit],
    toContain: js.Function1[js.Any, scala.Unit],
    toEqual: js.Function1[js.Any, scala.Unit],
    toMatch: js.Function1[js.Any, scala.Unit]
  ): Expect = {
    val __obj = js.Dynamic.literal(not = not, toBe = toBe, toBeDefined = toBeDefined, toBeFalsy = toBeFalsy, toBeGreaterThan = toBeGreaterThan, toBeLessThan = toBeLessThan, toBeNull = toBeNull, toBeTruthy = toBeTruthy, toContain = toContain, toEqual = toEqual, toMatch = toMatch)
  
    __obj.asInstanceOf[Expect]
  }
}

