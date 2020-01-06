package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeFilter extends js.Object {
  /**
    * Performs a logical AND operation on all supplied filters.
    */
  var AndAllFilters: js.UndefOr[AttributeFilterList] = js.native
  /**
    * Returns true when a document contains all of the specified document attributes.
    */
  var ContainsAll: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Returns true when a document contains any of the specified document attributes.
    */
  var ContainsAny: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs an equals operation on two document attributes.
    */
  var EqualsTo: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a greater than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThan: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThanOrEquals: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a less than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThan: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a less than or equals operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThanOrEquals: js.UndefOr[DocumentAttribute] = js.native
  /**
    * Performs a logical NOT operation on all supplied filters.
    */
  var NotFilter: js.UndefOr[AttributeFilter] = js.native
  /**
    * Performs a logical OR operation on all supplied filters.
    */
  var OrAllFilters: js.UndefOr[AttributeFilterList] = js.native
}

object AttributeFilter {
  @scala.inline
  def apply(
    AndAllFilters: AttributeFilterList = null,
    ContainsAll: DocumentAttribute = null,
    ContainsAny: DocumentAttribute = null,
    EqualsTo: DocumentAttribute = null,
    GreaterThan: DocumentAttribute = null,
    GreaterThanOrEquals: DocumentAttribute = null,
    LessThan: DocumentAttribute = null,
    LessThanOrEquals: DocumentAttribute = null,
    NotFilter: AttributeFilter = null,
    OrAllFilters: AttributeFilterList = null
  ): AttributeFilter = {
    val __obj = js.Dynamic.literal()
    if (AndAllFilters != null) __obj.updateDynamic("AndAllFilters")(AndAllFilters.asInstanceOf[js.Any])
    if (ContainsAll != null) __obj.updateDynamic("ContainsAll")(ContainsAll.asInstanceOf[js.Any])
    if (ContainsAny != null) __obj.updateDynamic("ContainsAny")(ContainsAny.asInstanceOf[js.Any])
    if (EqualsTo != null) __obj.updateDynamic("EqualsTo")(EqualsTo.asInstanceOf[js.Any])
    if (GreaterThan != null) __obj.updateDynamic("GreaterThan")(GreaterThan.asInstanceOf[js.Any])
    if (GreaterThanOrEquals != null) __obj.updateDynamic("GreaterThanOrEquals")(GreaterThanOrEquals.asInstanceOf[js.Any])
    if (LessThan != null) __obj.updateDynamic("LessThan")(LessThan.asInstanceOf[js.Any])
    if (LessThanOrEquals != null) __obj.updateDynamic("LessThanOrEquals")(LessThanOrEquals.asInstanceOf[js.Any])
    if (NotFilter != null) __obj.updateDynamic("NotFilter")(NotFilter.asInstanceOf[js.Any])
    if (OrAllFilters != null) __obj.updateDynamic("OrAllFilters")(OrAllFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilter]
  }
}

