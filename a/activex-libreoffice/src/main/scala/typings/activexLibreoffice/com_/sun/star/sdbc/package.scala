package typings.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sdbc {
  
  /**
    * is the basic service for pooling SDBC connections.
    *
    * When the method {@link com.sun.star.sdbc.XPooledConnection.getConnection()} is called, the {@link ConnectionPool} will attempt to locate a suitable
    * pooled connection or create a new connection from the {@link DriverManager} . When the connection will be released it will move to the pool of unused
    * connections.
    * @see com.sun.star.sdbc.XDriver
    * @see com.sun.star.sdbc.XConnection
    */
  type ConnectionPool = typings.activexLibreoffice.com_.sun.star.sdbc.XConnectionPool
  
  /**
    * is the service that every driver class must implement.
    *
    * Each driver should supply a service that implements the {@link Driver} interface.
    *
    * The {@link DriverManager} will try to load as many drivers as it can find and then for any given connection request, it will ask each driver in turn
    * to try to connect to the target URL.
    *
    * It is strongly recommended that each {@link Driver} object should be small and standalone so that the {@link Driver} object can be loaded and queried
    * without bringing in vast quantities of supporting code.
    *
    * Each driver should be a one instance service.
    * @see com.sun.star.sdbc.XDriverManager
    * @see com.sun.star.sdbc.XConnection
    */
  type Driver = typings.activexLibreoffice.com_.sun.star.sdbc.XDriver
  
  type DriverManager = typings.activexLibreoffice.com_.sun.star.sdbc.XDriverManager2
  
  /**
    * is an exception that provides information on database access warnings. Warnings are silently chained to the object whose method caused it to be
    * reported.
    * @see XConnection.getWarnings
    * @see XResultSet.getWarnings
    * @see XStatement.getWarnings
    */
  type SQLWarning = typings.activexLibreoffice.com_.sun.star.sdbc.SQLException
}
