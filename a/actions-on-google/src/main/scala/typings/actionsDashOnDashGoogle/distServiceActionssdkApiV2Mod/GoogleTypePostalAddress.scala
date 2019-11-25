package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleTypePostalAddress extends js.Object {
  /**
    * Unstructured address lines describing the lower levels of an address.
    *
    * Because values in address_lines do not have type information and may
    * sometimes contain multiple values in a single field (e.g.
    * \"Austin, TX\"), it is important that the line order is clear. The order of
    * address lines should be \"envelope order\" for the country/region of the
    * address. In places where this can vary (e.g. Japan), address_language is
    * used to make it explicit (e.g. \"ja\" for large-to-small ordering and
    * \"ja-Latn\" or \"en\" for small-to-large). This way, the most specific line
    * of an address can be selected based on the language.
    *
    * The minimum permitted structural representation of an address consists
    * of a region_code with all remaining information placed in the
    * address_lines. It would be possible to format such an address very
    * approximately without geocoding, but no semantic reasoning could be
    * made about any of the address components until it was at least
    * partially resolved.
    *
    * Creating an address only containing a region_code and address_lines, and
    * then geocoding is the recommended way to handle completely unstructured
    * addresses (as opposed to guessing which parts of the address should be
    * localities or administrative areas).
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional. Highest administrative subdivision which is used for postal
    * addresses of a country or region.
    * For example, this can be a state, a province, an oblast, or a prefecture.
    * Specifically, for Spain this is the province and not the autonomous
    * community (e.g. \"Barcelona\" and not \"Catalonia\").
    * Many countries don't use an administrative area in postal addresses. E.g.
    * in Switzerland this should be left unpopulated.
    */
  var administrativeArea: js.UndefOr[String] = js.undefined
  /**
    * Optional. BCP-47 language code of the contents of this address (if
    * known). This is often the UI language of the input form or is expected
    * to match one of the languages used in the address' country/region, or their
    * transliterated equivalents.
    * This can affect formatting in certain countries, but is not critical
    * to the correctness of the data and will never affect any validation or
    * other non-formatting related operations.
    *
    * If this value is not known, it should be omitted (rather than specifying a
    * possibly incorrect default).
    *
    * Examples: \"zh-Hant\", \"ja\", \"ja-Latn\", \"en\".
    */
  var languageCode: js.UndefOr[String] = js.undefined
  /**
    * Optional. Generally refers to the city/town portion of the address.
    * Examples: US city, IT comune, UK post town.
    * In regions of the world where localities are not well defined or do not fit
    * into this structure well, leave locality empty and use address_lines.
    */
  var locality: js.UndefOr[String] = js.undefined
  /**
    * Optional. The name of the organization at the address.
    */
  var organization: js.UndefOr[String] = js.undefined
  /**
    * Optional. Postal code of the address. Not all countries use or require
    * postal codes to be present, but where they are used, they may trigger
    * additional validation with other parts of the address (e.g. state/zip
    * validation in the U.S.A.).
    */
  var postalCode: js.UndefOr[String] = js.undefined
  /**
    * Optional. The recipient at the address.
    * This field may, under certain circumstances, contain multiline information.
    * For example, it might contain \"care of\" information.
    */
  var recipients: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Required. CLDR region code of the country/region of the address. This
    * is never inferred and it is up to the user to ensure the value is
    * correct. See http://cldr.unicode.org/ and
    * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
    * for details. Example: \"CH\" for Switzerland.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  /**
    * The schema revision of the `PostalAddress`. This must be set to 0, which is
    * the latest revision.
    *
    * All new revisions **must** be backward compatible with old revisions.
    */
  var revision: js.UndefOr[Double] = js.undefined
  /**
    * Optional. Additional, country-specific, sorting code. This is not used
    * in most regions. Where it is used, the value is either a string like
    * \"CEDEX\", optionally followed by a number (e.g. \"CEDEX 7\"), or just a
    * number alone, representing the \"sector code\" (Jamaica), \"delivery area
    * indicator\" (Malawi) or \"post office indicator\" (e.g. Côte d'Ivoire).
    */
  var sortingCode: js.UndefOr[String] = js.undefined
  /**
    * Optional. Sublocality of the address.
    * For example, this can be neighborhoods, boroughs, districts.
    */
  var sublocality: js.UndefOr[String] = js.undefined
}

object GoogleTypePostalAddress {
  @scala.inline
  def apply(
    addressLines: js.Array[String] = null,
    administrativeArea: String = null,
    languageCode: String = null,
    locality: String = null,
    organization: String = null,
    postalCode: String = null,
    recipients: js.Array[String] = null,
    regionCode: String = null,
    revision: Int | Double = null,
    sortingCode: String = null,
    sublocality: String = null
  ): GoogleTypePostalAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode.asInstanceOf[js.Any])
    if (sublocality != null) __obj.updateDynamic("sublocality")(sublocality.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleTypePostalAddress]
  }
}

