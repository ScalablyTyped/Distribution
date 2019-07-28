package typings.angularDashScenario.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers extends js.Object {
  def toBe(value: js.Any): Unit
  def toBeDefined(): Unit
  def toBeFalsy(): Unit
  def toBeGreaterThan(value: js.Any): Unit
  def toBeLessThan(value: js.Any): Unit
  def toBeNull(): Unit
  def toBeTruthy(): Unit
  def toContain(value: js.Any): Unit
  def toEqual(value: js.Any): Unit
  def toMatch(regularExpression: js.Any): Unit
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
}

