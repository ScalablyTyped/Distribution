package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALPNENABLED extends js.Object {
  val ALPN_ENABLED: scala.Double
  val DH_CHECK_P_NOT_PRIME: scala.Double
  val DH_CHECK_P_NOT_SAFE_PRIME: scala.Double
  val DH_NOT_SUITABLE_GENERATOR: scala.Double
  val DH_UNABLE_TO_CHECK_GENERATOR: scala.Double
  val ENGINE_METHOD_ALL: scala.Double
  val ENGINE_METHOD_CIPHERS: scala.Double
  val ENGINE_METHOD_DH: scala.Double
  val ENGINE_METHOD_DIGESTS: scala.Double
  val ENGINE_METHOD_DSA: scala.Double
  val ENGINE_METHOD_EC: scala.Double
  val ENGINE_METHOD_NONE: scala.Double
  val ENGINE_METHOD_PKEY_ASN1_METHS: scala.Double
  val ENGINE_METHOD_PKEY_METHS: scala.Double
  val ENGINE_METHOD_RAND: scala.Double
  val ENGINE_METHOD_RSA: scala.Double
  // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
  val OPENSSL_VERSION_NUMBER: scala.Double
  val POINT_CONVERSION_COMPRESSED: scala.Double
  val POINT_CONVERSION_HYBRID: scala.Double
  val POINT_CONVERSION_UNCOMPRESSED: scala.Double
  val RSA_NO_PADDING: scala.Double
  val RSA_PKCS1_OAEP_PADDING: scala.Double
  val RSA_PKCS1_PADDING: scala.Double
  val RSA_PKCS1_PSS_PADDING: scala.Double
  /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
  val RSA_PSS_SALTLEN_AUTO: scala.Double
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
  val RSA_PSS_SALTLEN_DIGEST: scala.Double
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
  val RSA_PSS_SALTLEN_MAX_SIGN: scala.Double
  val RSA_SSLV23_PADDING: scala.Double
  val RSA_X931_PADDING: scala.Double
  /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
  val SSL_OP_ALL: scala.Double
  /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: scala.Double
  /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_CIPHER_SERVER_PREFERENCE: scala.Double
  /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
  val SSL_OP_CISCO_ANYCONNECT: scala.Double
  /** Instructs OpenSSL to turn on cookie exchange. */
  val SSL_OP_COOKIE_EXCHANGE: scala.Double
  /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: scala.Double
  /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: scala.Double
  /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
  val SSL_OP_EPHEMERAL_RSA: scala.Double
  /** Allows initial connection to servers that do not support RI. */
  val SSL_OP_LEGACY_SERVER_CONNECT: scala.Double
  val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: scala.Double
  val SSL_OP_MICROSOFT_SESS_ID_BUG: scala.Double
  /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
  val SSL_OP_MSIE_SSLV2_RSA_PADDING: scala.Double
  val SSL_OP_NETSCAPE_CA_DN_BUG: scala.Double
  val SSL_OP_NETSCAPE_CHALLENGE_BUG: scala.Double
  val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: scala.Double
  val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: scala.Double
  /** Instructs OpenSSL to disable support for SSL/TLS compression. */
  val SSL_OP_NO_COMPRESSION: scala.Double
  val SSL_OP_NO_QUERY_MTU: scala.Double
  /** Instructs OpenSSL to always start a new session when performing renegotiation. */
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: scala.Double
  val SSL_OP_NO_SSLv2: scala.Double
  val SSL_OP_NO_SSLv3: scala.Double
  val SSL_OP_NO_TICKET: scala.Double
  val SSL_OP_NO_TLSv1: scala.Double
  val SSL_OP_NO_TLSv1_1: scala.Double
  val SSL_OP_NO_TLSv1_2: scala.Double
  val SSL_OP_PKCS1_CHECK_1: scala.Double
  val SSL_OP_PKCS1_CHECK_2: scala.Double
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
  val SSL_OP_SINGLE_DH_USE: scala.Double
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
  val SSL_OP_SINGLE_ECDH_USE: scala.Double
  val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: scala.Double
  val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: scala.Double
  val SSL_OP_TLS_BLOCK_PADDING_BUG: scala.Double
  val SSL_OP_TLS_D5_BUG: scala.Double
  /** Instructs OpenSSL to disable version rollback attack detection. */
  val SSL_OP_TLS_ROLLBACK_BUG: scala.Double
  /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
  val defaultCipherList: java.lang.String
  /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
  val defaultCoreCipherList: java.lang.String
}

object Anon_ALPNENABLED {
  @scala.inline
  def apply(
    ALPN_ENABLED: scala.Double,
    DH_CHECK_P_NOT_PRIME: scala.Double,
    DH_CHECK_P_NOT_SAFE_PRIME: scala.Double,
    DH_NOT_SUITABLE_GENERATOR: scala.Double,
    DH_UNABLE_TO_CHECK_GENERATOR: scala.Double,
    ENGINE_METHOD_ALL: scala.Double,
    ENGINE_METHOD_CIPHERS: scala.Double,
    ENGINE_METHOD_DH: scala.Double,
    ENGINE_METHOD_DIGESTS: scala.Double,
    ENGINE_METHOD_DSA: scala.Double,
    ENGINE_METHOD_EC: scala.Double,
    ENGINE_METHOD_NONE: scala.Double,
    ENGINE_METHOD_PKEY_ASN1_METHS: scala.Double,
    ENGINE_METHOD_PKEY_METHS: scala.Double,
    ENGINE_METHOD_RAND: scala.Double,
    ENGINE_METHOD_RSA: scala.Double,
    OPENSSL_VERSION_NUMBER: scala.Double,
    POINT_CONVERSION_COMPRESSED: scala.Double,
    POINT_CONVERSION_HYBRID: scala.Double,
    POINT_CONVERSION_UNCOMPRESSED: scala.Double,
    RSA_NO_PADDING: scala.Double,
    RSA_PKCS1_OAEP_PADDING: scala.Double,
    RSA_PKCS1_PADDING: scala.Double,
    RSA_PKCS1_PSS_PADDING: scala.Double,
    RSA_PSS_SALTLEN_AUTO: scala.Double,
    RSA_PSS_SALTLEN_DIGEST: scala.Double,
    RSA_PSS_SALTLEN_MAX_SIGN: scala.Double,
    RSA_SSLV23_PADDING: scala.Double,
    RSA_X931_PADDING: scala.Double,
    SSL_OP_ALL: scala.Double,
    SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: scala.Double,
    SSL_OP_CIPHER_SERVER_PREFERENCE: scala.Double,
    SSL_OP_CISCO_ANYCONNECT: scala.Double,
    SSL_OP_COOKIE_EXCHANGE: scala.Double,
    SSL_OP_CRYPTOPRO_TLSEXT_BUG: scala.Double,
    SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: scala.Double,
    SSL_OP_EPHEMERAL_RSA: scala.Double,
    SSL_OP_LEGACY_SERVER_CONNECT: scala.Double,
    SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: scala.Double,
    SSL_OP_MICROSOFT_SESS_ID_BUG: scala.Double,
    SSL_OP_MSIE_SSLV2_RSA_PADDING: scala.Double,
    SSL_OP_NETSCAPE_CA_DN_BUG: scala.Double,
    SSL_OP_NETSCAPE_CHALLENGE_BUG: scala.Double,
    SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: scala.Double,
    SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: scala.Double,
    SSL_OP_NO_COMPRESSION: scala.Double,
    SSL_OP_NO_QUERY_MTU: scala.Double,
    SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: scala.Double,
    SSL_OP_NO_SSLv2: scala.Double,
    SSL_OP_NO_SSLv3: scala.Double,
    SSL_OP_NO_TICKET: scala.Double,
    SSL_OP_NO_TLSv1: scala.Double,
    SSL_OP_NO_TLSv1_1: scala.Double,
    SSL_OP_NO_TLSv1_2: scala.Double,
    SSL_OP_PKCS1_CHECK_1: scala.Double,
    SSL_OP_PKCS1_CHECK_2: scala.Double,
    SSL_OP_SINGLE_DH_USE: scala.Double,
    SSL_OP_SINGLE_ECDH_USE: scala.Double,
    SSL_OP_SSLEAY_080_CLIENT_DH_BUG: scala.Double,
    SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: scala.Double,
    SSL_OP_TLS_BLOCK_PADDING_BUG: scala.Double,
    SSL_OP_TLS_D5_BUG: scala.Double,
    SSL_OP_TLS_ROLLBACK_BUG: scala.Double,
    defaultCipherList: java.lang.String,
    defaultCoreCipherList: java.lang.String
  ): Anon_ALPNENABLED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALPN_ENABLED")(ALPN_ENABLED)
    __obj.updateDynamic("DH_CHECK_P_NOT_PRIME")(DH_CHECK_P_NOT_PRIME)
    __obj.updateDynamic("DH_CHECK_P_NOT_SAFE_PRIME")(DH_CHECK_P_NOT_SAFE_PRIME)
    __obj.updateDynamic("DH_NOT_SUITABLE_GENERATOR")(DH_NOT_SUITABLE_GENERATOR)
    __obj.updateDynamic("DH_UNABLE_TO_CHECK_GENERATOR")(DH_UNABLE_TO_CHECK_GENERATOR)
    __obj.updateDynamic("ENGINE_METHOD_ALL")(ENGINE_METHOD_ALL)
    __obj.updateDynamic("ENGINE_METHOD_CIPHERS")(ENGINE_METHOD_CIPHERS)
    __obj.updateDynamic("ENGINE_METHOD_DH")(ENGINE_METHOD_DH)
    __obj.updateDynamic("ENGINE_METHOD_DIGESTS")(ENGINE_METHOD_DIGESTS)
    __obj.updateDynamic("ENGINE_METHOD_DSA")(ENGINE_METHOD_DSA)
    __obj.updateDynamic("ENGINE_METHOD_EC")(ENGINE_METHOD_EC)
    __obj.updateDynamic("ENGINE_METHOD_NONE")(ENGINE_METHOD_NONE)
    __obj.updateDynamic("ENGINE_METHOD_PKEY_ASN1_METHS")(ENGINE_METHOD_PKEY_ASN1_METHS)
    __obj.updateDynamic("ENGINE_METHOD_PKEY_METHS")(ENGINE_METHOD_PKEY_METHS)
    __obj.updateDynamic("ENGINE_METHOD_RAND")(ENGINE_METHOD_RAND)
    __obj.updateDynamic("ENGINE_METHOD_RSA")(ENGINE_METHOD_RSA)
    __obj.updateDynamic("OPENSSL_VERSION_NUMBER")(OPENSSL_VERSION_NUMBER)
    __obj.updateDynamic("POINT_CONVERSION_COMPRESSED")(POINT_CONVERSION_COMPRESSED)
    __obj.updateDynamic("POINT_CONVERSION_HYBRID")(POINT_CONVERSION_HYBRID)
    __obj.updateDynamic("POINT_CONVERSION_UNCOMPRESSED")(POINT_CONVERSION_UNCOMPRESSED)
    __obj.updateDynamic("RSA_NO_PADDING")(RSA_NO_PADDING)
    __obj.updateDynamic("RSA_PKCS1_OAEP_PADDING")(RSA_PKCS1_OAEP_PADDING)
    __obj.updateDynamic("RSA_PKCS1_PADDING")(RSA_PKCS1_PADDING)
    __obj.updateDynamic("RSA_PKCS1_PSS_PADDING")(RSA_PKCS1_PSS_PADDING)
    __obj.updateDynamic("RSA_PSS_SALTLEN_AUTO")(RSA_PSS_SALTLEN_AUTO)
    __obj.updateDynamic("RSA_PSS_SALTLEN_DIGEST")(RSA_PSS_SALTLEN_DIGEST)
    __obj.updateDynamic("RSA_PSS_SALTLEN_MAX_SIGN")(RSA_PSS_SALTLEN_MAX_SIGN)
    __obj.updateDynamic("RSA_SSLV23_PADDING")(RSA_SSLV23_PADDING)
    __obj.updateDynamic("RSA_X931_PADDING")(RSA_X931_PADDING)
    __obj.updateDynamic("SSL_OP_ALL")(SSL_OP_ALL)
    __obj.updateDynamic("SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")(SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION)
    __obj.updateDynamic("SSL_OP_CIPHER_SERVER_PREFERENCE")(SSL_OP_CIPHER_SERVER_PREFERENCE)
    __obj.updateDynamic("SSL_OP_CISCO_ANYCONNECT")(SSL_OP_CISCO_ANYCONNECT)
    __obj.updateDynamic("SSL_OP_COOKIE_EXCHANGE")(SSL_OP_COOKIE_EXCHANGE)
    __obj.updateDynamic("SSL_OP_CRYPTOPRO_TLSEXT_BUG")(SSL_OP_CRYPTOPRO_TLSEXT_BUG)
    __obj.updateDynamic("SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")(SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS)
    __obj.updateDynamic("SSL_OP_EPHEMERAL_RSA")(SSL_OP_EPHEMERAL_RSA)
    __obj.updateDynamic("SSL_OP_LEGACY_SERVER_CONNECT")(SSL_OP_LEGACY_SERVER_CONNECT)
    __obj.updateDynamic("SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER")(SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER)
    __obj.updateDynamic("SSL_OP_MICROSOFT_SESS_ID_BUG")(SSL_OP_MICROSOFT_SESS_ID_BUG)
    __obj.updateDynamic("SSL_OP_MSIE_SSLV2_RSA_PADDING")(SSL_OP_MSIE_SSLV2_RSA_PADDING)
    __obj.updateDynamic("SSL_OP_NETSCAPE_CA_DN_BUG")(SSL_OP_NETSCAPE_CA_DN_BUG)
    __obj.updateDynamic("SSL_OP_NETSCAPE_CHALLENGE_BUG")(SSL_OP_NETSCAPE_CHALLENGE_BUG)
    __obj.updateDynamic("SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG")(SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG)
    __obj.updateDynamic("SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG")(SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG)
    __obj.updateDynamic("SSL_OP_NO_COMPRESSION")(SSL_OP_NO_COMPRESSION)
    __obj.updateDynamic("SSL_OP_NO_QUERY_MTU")(SSL_OP_NO_QUERY_MTU)
    __obj.updateDynamic("SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")(SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION)
    __obj.updateDynamic("SSL_OP_NO_SSLv2")(SSL_OP_NO_SSLv2)
    __obj.updateDynamic("SSL_OP_NO_SSLv3")(SSL_OP_NO_SSLv3)
    __obj.updateDynamic("SSL_OP_NO_TICKET")(SSL_OP_NO_TICKET)
    __obj.updateDynamic("SSL_OP_NO_TLSv1")(SSL_OP_NO_TLSv1)
    __obj.updateDynamic("SSL_OP_NO_TLSv1_1")(SSL_OP_NO_TLSv1_1)
    __obj.updateDynamic("SSL_OP_NO_TLSv1_2")(SSL_OP_NO_TLSv1_2)
    __obj.updateDynamic("SSL_OP_PKCS1_CHECK_1")(SSL_OP_PKCS1_CHECK_1)
    __obj.updateDynamic("SSL_OP_PKCS1_CHECK_2")(SSL_OP_PKCS1_CHECK_2)
    __obj.updateDynamic("SSL_OP_SINGLE_DH_USE")(SSL_OP_SINGLE_DH_USE)
    __obj.updateDynamic("SSL_OP_SINGLE_ECDH_USE")(SSL_OP_SINGLE_ECDH_USE)
    __obj.updateDynamic("SSL_OP_SSLEAY_080_CLIENT_DH_BUG")(SSL_OP_SSLEAY_080_CLIENT_DH_BUG)
    __obj.updateDynamic("SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG")(SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG)
    __obj.updateDynamic("SSL_OP_TLS_BLOCK_PADDING_BUG")(SSL_OP_TLS_BLOCK_PADDING_BUG)
    __obj.updateDynamic("SSL_OP_TLS_D5_BUG")(SSL_OP_TLS_D5_BUG)
    __obj.updateDynamic("SSL_OP_TLS_ROLLBACK_BUG")(SSL_OP_TLS_ROLLBACK_BUG)
    __obj.updateDynamic("defaultCipherList")(defaultCipherList)
    __obj.updateDynamic("defaultCoreCipherList")(defaultCoreCipherList)
    __obj.asInstanceOf[Anon_ALPNENABLED]
  }
}

