package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`10`
import typings.activexLibreoffice.activexLibreofficeNumbers.`11`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the type of a single condition in a filter descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`11`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`10`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
*/
trait FilterOperator extends js.Object
object FilterOperator {
  
  /** selects a specified percentage of entries with the lowest values. */
  @scala.inline
  def BOTTOM_PERCENT: `11` = 11.asInstanceOf[`11`]
  
  /** selects a specified number of entries with the lowest values. */
  @scala.inline
  def BOTTOM_VALUES: `10` = 10.asInstanceOf[`10`]
  
  /** selects empty entries. */
  @scala.inline
  def EMPTY: `0` = 0.asInstanceOf[`0`]
  
  /** value has to be equal to the specified value. */
  @scala.inline
  def EQUAL: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @scala.inline
  def GREATER: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @scala.inline
  def GREATER_EQUAL: `5` = 5.asInstanceOf[`5`]
  
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @scala.inline
  def LESS: `6` = 6.asInstanceOf[`6`]
  
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @scala.inline
  def LESS_EQUAL: `7` = 7.asInstanceOf[`7`]
  
  /** selects non-empty entries. */
  @scala.inline
  def NOT_EMPTY: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @scala.inline
  def NOT_EQUAL: `3` = 3.asInstanceOf[`3`]
  
  /** selects a specified percentage of entries with the greatest values. */
  @scala.inline
  def TOP_PERCENT: `9` = 9.asInstanceOf[`9`]
  
  /** selects a specified number of entries with the greatest values. */
  @scala.inline
  def TOP_VALUES: `8` = 8.asInstanceOf[`8`]
}
