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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("not")(not)
    __obj.updateDynamic("toBe")(toBe)
    __obj.updateDynamic("toBeDefined")(toBeDefined)
    __obj.updateDynamic("toBeFalsy")(toBeFalsy)
    __obj.updateDynamic("toBeGreaterThan")(toBeGreaterThan)
    __obj.updateDynamic("toBeLessThan")(toBeLessThan)
    __obj.updateDynamic("toBeNull")(toBeNull)
    __obj.updateDynamic("toBeTruthy")(toBeTruthy)
    __obj.updateDynamic("toContain")(toContain)
    __obj.updateDynamic("toEqual")(toEqual)
    __obj.updateDynamic("toMatch")(toMatch)
    __obj.asInstanceOf[Expect]
  }
}

