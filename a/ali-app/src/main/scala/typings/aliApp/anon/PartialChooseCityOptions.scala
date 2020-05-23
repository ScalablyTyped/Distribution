package typings.aliApp.anon

import typings.aliApp.my.City
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ChooseCityOptions> */
trait PartialChooseCityOptions extends js.Object {
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var hotCities: js.UndefOr[js.Array[City]] = js.undefined
  var showHotCities: js.UndefOr[Boolean] = js.undefined
  var showLocatedCity: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ AdCode, Unit]] = js.undefined
}

object PartialChooseCityOptions {
  @scala.inline
  def apply(
    cities: js.Array[City] = null,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    hotCities: js.Array[City] = null,
    showHotCities: js.UndefOr[Boolean] = js.undefined,
    showLocatedCity: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ AdCode => Unit = null
  ): PartialChooseCityOptions = {
    val __obj = js.Dynamic.literal()
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (hotCities != null) __obj.updateDynamic("hotCities")(hotCities.asInstanceOf[js.Any])
    if (!js.isUndefined(showHotCities)) __obj.updateDynamic("showHotCities")(showHotCities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocatedCity)) __obj.updateDynamic("showLocatedCity")(showLocatedCity.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PartialChooseCityOptions]
  }
}

