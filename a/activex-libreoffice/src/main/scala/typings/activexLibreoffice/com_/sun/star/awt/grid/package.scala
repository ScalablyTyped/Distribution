package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object grid {
  
  /**
    * If you do not want to implement the {@link XGridColumnModel} yourself, use this service.
    * @since OOo 3.3
    */
  type DefaultGridColumnModel = typings.activexLibreoffice.com_.sun.star.awt.grid.XGridColumnModel
  
  /**
    * If you do not want to implement the {@link XGridDataModel} yourself, use this service.
    *
    * The `DefaultGridDataModel` implementation is a dumb container of tabular data. You can add and remove rows, modify cell values, and the like.
    *
    * The implementation will implicitly increase its column count if you add a row which has more values than the current column count.
    * @since OOo 3.3
    */
  type DefaultGridDataModel = typings.activexLibreoffice.com_.sun.star.awt.grid.XMutableGridDataModel
  
  /**
    * Represents a column as used by the {@link DefaultGridColumnModel}
    * @since OOo 3.3
    */
  type GridColumn = typings.activexLibreoffice.com_.sun.star.awt.grid.XGridColumn
  
  /**
    * Exception is thrown to indicate that set data is invalid, e.g. type of data is unknown or data count doesn't match with column count.
    * @since OOo 3.3
    */
  type GridInvalidDataException = typings.activexLibreoffice.com_.sun.star.uno.RuntimeException
  
  /**
    * Exception is thrown when data or column model isn't set.
    * @since OOo 3.3
    */
  type GridInvalidModelException = typings.activexLibreoffice.com_.sun.star.uno.RuntimeException
}
