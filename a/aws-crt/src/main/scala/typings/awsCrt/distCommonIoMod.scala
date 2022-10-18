package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonIoMod {
  
  @js.native
  sealed trait SocketDomain extends StObject
  @JSImport("aws-crt/dist/common/io", "SocketDomain")
  @js.native
  object SocketDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SocketDomain & Double] = js.native
    
    /** IPv4 sockets */
    @js.native
    sealed trait IPV4
      extends StObject
         with SocketDomain
    /* 0 */ val IPV4: typings.awsCrt.distCommonIoMod.SocketDomain.IPV4 & Double = js.native
    
    /** IPv6 sockets */
    @js.native
    sealed trait IPV6
      extends StObject
         with SocketDomain
    /* 1 */ val IPV6: typings.awsCrt.distCommonIoMod.SocketDomain.IPV6 & Double = js.native
    
    /** UNIX domain socket/Windows named pipes */
    @js.native
    sealed trait LOCAL
      extends StObject
         with SocketDomain
    /* 2 */ val LOCAL: typings.awsCrt.distCommonIoMod.SocketDomain.LOCAL & Double = js.native
  }
  
  @js.native
  sealed trait SocketType extends StObject
  @JSImport("aws-crt/dist/common/io", "SocketType")
  @js.native
  object SocketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SocketType & Double] = js.native
    
    /**
      * A datagram socket is connectionless and sends unreliable messages.
      * This means UDP when used with {@link SocketDomain.IPV4}/{@link SocketDomain.IPV6}.
      * {@link SocketDomain.LOCAL} is not compatible with {@link DGRAM}
      */
    @js.native
    sealed trait DGRAM
      extends StObject
         with SocketType
    /* 1 */ val DGRAM: typings.awsCrt.distCommonIoMod.SocketType.DGRAM & Double = js.native
    
    /**
      * A streaming socket sends reliable messages over a two-way connection.
      * This means TCP when used with {@link SocketDomain.IPV4}/{@link SocketDomain.IPV6},
      * and Unix domain sockets when used with {@link SocketDomain.LOCAL }
      */
    @js.native
    sealed trait STREAM
      extends StObject
         with SocketType
    /* 0 */ val STREAM: typings.awsCrt.distCommonIoMod.SocketType.STREAM & Double = js.native
  }
  
  @js.native
  sealed trait TlsVersion extends StObject
  @JSImport("aws-crt/dist/common/io", "TlsVersion")
  @js.native
  object TlsVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TlsVersion & Double] = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with TlsVersion
    /* 128 */ val Default: typings.awsCrt.distCommonIoMod.TlsVersion.Default & Double = js.native
    
    @js.native
    sealed trait SSLv3
      extends StObject
         with TlsVersion
    /* 0 */ val SSLv3: typings.awsCrt.distCommonIoMod.TlsVersion.SSLv3 & Double = js.native
    
    @js.native
    sealed trait TLSv1
      extends StObject
         with TlsVersion
    /* 1 */ val TLSv1: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1 & Double = js.native
    
    @js.native
    sealed trait TLSv1_1
      extends StObject
         with TlsVersion
    /* 2 */ val TLSv1_1: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1_1 & Double = js.native
    
    @js.native
    sealed trait TLSv1_2
      extends StObject
         with TlsVersion
    /* 3 */ val TLSv1_2: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1_2 & Double = js.native
    
    @js.native
    sealed trait TLSv1_3
      extends StObject
         with TlsVersion
    /* 4 */ val TLSv1_3: typings.awsCrt.distCommonIoMod.TlsVersion.TLSv1_3 & Double = js.native
  }
}
