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
  ): Matchers = {
    val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toMatch = js.Any.fromFunction1(toMatch))
  
    __obj.asInstanceOf[Matchers]
  }
}

