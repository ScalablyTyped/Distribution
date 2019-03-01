package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers extends js.Object {
  def toBe(value: js.Any): scala.Unit
  def toBeDefined(): scala.Unit
  def toBeFalsy(): scala.Unit
  def toBeGreaterThan(value: js.Any): scala.Unit
  def toBeLessThan(value: js.Any): scala.Unit
  def toBeNull(): scala.Unit
  def toBeTruthy(): scala.Unit
  def toContain(value: js.Any): scala.Unit
  def toEqual(value: js.Any): scala.Unit
  def toMatch(regularExpression: js.Any): scala.Unit
}

object Matchers {
  @scala.inline
  def apply(
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
  ): Matchers = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[Matchers]
  }
}

