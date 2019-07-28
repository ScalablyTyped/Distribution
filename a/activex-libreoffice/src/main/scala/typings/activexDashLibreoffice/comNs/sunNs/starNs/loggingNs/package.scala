package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loggingNs {
  /**
    * This singleton is intended to log the IO events related to loading/storing of documents.
    *
    * Please do not use the singleton without communication with source owner!
    * @since OOo 3.2
    */
  type DocumentIOLogRing = XSimpleLogRing
  /**
    * the global pool of named {@link XLogger} instances
    *
    * The one and only `LoggerPool` instance is available at a component context as value with the key `/singletons/com.sun.star.logging.LoggerPool` .
    *
    * the global pool of named {@link XLogger} instances
    *
    * The one and only `LoggerPool` instance is available at a component context as value with the key `/singletons/com.sun.star.logging.LoggerPool` .
    * @since OOo 2.3
    */
  type LoggerPool = XLoggerPool
}
