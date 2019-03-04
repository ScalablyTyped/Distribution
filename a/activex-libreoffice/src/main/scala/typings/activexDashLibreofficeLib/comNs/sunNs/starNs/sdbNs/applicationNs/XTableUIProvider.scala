package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used by the database application to obtain non-default user interface information and/or components for database tables.
  * @see com.sun.star.sdb.Connection
  * @since OOo 2.2
  */
trait XTableUIProvider extends js.Object {
  /**
    * returns a component which can be used to edit the definition of an existing table.
    * @param DocumentUI provides access to the UI in which the database document is currently displayed. ;  In particular, this parameter provides access to t
    * @param TableName denotes the fully qualified name of an existing table.
    * @returns a component which can be used to edit the definition of an existing table, or `NULL` if the default component should be used. ;  Two component ty
    * @throws com::sun::star::lang::IllegalArgumentException if the given TableName does not denote an existing table
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs while creating the table editor component.
    */
  def getTableEditor(DocumentUI: XDatabaseDocumentUI, TableName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * provides the icon which should be used to represent the table in the database application window.
    *
    * The icon will usually be requested once per table, and cached. It might be requested again if the application settings change, for instance, if
    * another desktop theme has been activated.
    * @param TableName denotes the fully qualified name of the database table.
    * @param ColorMode denotes the color mode of the graphic to retrieve, being one of the {@link com.sun.star.graphic.GraphicColorMode} constants.
    * @returns the icon which should be used to represent the table in the database application window, or `NULL` if the default icon should be used.
    */
  def getTableIcon(TableName: java.lang.String, ColorMode: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
}

object XTableUIProvider {
  @scala.inline
  def apply(
    getTableEditor: js.Function2[
      XDatabaseDocumentUI, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    getTableIcon: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
    ]
  ): XTableUIProvider = {
    val __obj = js.Dynamic.literal(getTableEditor = getTableEditor, getTableIcon = getTableIcon)
  
    __obj.asInstanceOf[XTableUIProvider]
  }
}

