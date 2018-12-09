package typings
package adoneLib.adoneNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a set of bits
     */
@JSGlobal("adone.math.BitSet")
@js.native
class BitSet protected () extends js.Object {
  /**
           * Creates a new bitset from a dehydrated bitset
           */
  def this(key: java.lang.String) = this()
  /**
           * Creates a new bitset of n bits
           */
  def this(n: scala.Double) = this()
  /**
           * Performs a bitwise AND on 2 bitsets or 1 bitset and 1 index.
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def and(value: BitSet): BitSet = js.native
  /**
           * Performs a bitwise AND on 2 bitsets or 1 bitset and 1 index.
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def and(value: scala.Double): BitSet = js.native
  /**
           * Performs a circular shift bitset by an offset
           *
           * @param n number of positions that the bitset that will be shifted to the right. Using a negative number will result in a left shift.
           */
  def circularShift(n: scala.Double): BitSet = js.native
  /**
           * Clears the entire bitset
           */
  def clear(): scala.Boolean = js.native
  /**
           * Turns the bitset into a comma separated string that skips leading & trailing 0 words.
           * Ends with the number of leading 0s and MAX_BIT.
           * Useful if you need the bitset to be an object key (eg dynamic programming).
           * Can rehydrate by passing the result into the constructor
           */
  def dehydrate(): java.lang.String = js.native
  /**
           * Finds first set bit (useful for processing queues, breadth-first tree searches, etc.).
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by nextSetBit)
           */
  def ffs(): scala.Double = js.native
  /**
           * Finds first set bit (useful for processing queues, breadth-first tree searches, etc.).
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by nextSetBit)
           */
  def ffs(startWord: scala.Double): scala.Double = js.native
  /**
           * Finds first zero (unset bit).
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by nextUnsetBit)
           */
  def ffz(): scala.Double = js.native
  /**
           * Finds first zero (unset bit).
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by nextUnsetBit)
           */
  def ffz(startWord: scala.Double): scala.Double = js.native
  /**
           * Finds last set bit.
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by previousSetBit)
           */
  def fls(): scala.Double = js.native
  /**
           * Finds last set bit.
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by previousSetBit)
           */
  def fls(startWord: scala.Double): scala.Double = js.native
  /**
           * Finds last zero (unset bit).
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by previousUnsetBit)
           */
  def flz(): scala.Double = js.native
  /**
           * Finds last zero (unset bit).
           * Returns -1 if not found
           *
           * @param startWord the word to start with (only used internally by previousUnsetBit)
           */
  def flz(startWord: scala.Double): scala.Double = js.native
  /**
           * Runs a custom function on every set bit.
           * Faster than iterating over the entire bitset with a get().
           * If the callback returns `false` it stops iterating.
           */
  def forEach(callback: js.Function1[/* idx */ scala.Double, scala.Unit | scala.Boolean]): scala.Unit = js.native
  /**
           * Checks whether a bit at a specific index is set
           */
  def get(idx: scala.Double): scala.Boolean = js.native
  /**
           * Gets the cardinality (count of set bits) for the entire bitset
           */
  def getCardinality(): scala.Double = js.native
  /**
           * Gets the indices of all set bits
           */
  def getIndices(): js.Array[scala.Double] = js.native
  /**
           * Quickly determines if a bitset is empty
           */
  def isEmpty(): scala.Boolean = js.native
  /**
           * Quickly determines if both bitsets are equal (faster than checking if the XOR of the two is === 0).
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def isEqual(other: BitSet): scala.Boolean = js.native
  /**
           * Checks if one bitset is subset of another.
           */
  def isSubsetOf(other: BitSet): scala.Boolean = js.native
  /**
           * Finds first set bit, starting at a given index.
           * Return -1 if not found
           *
           * @param idx the starting index for the next set bit
           */
  def nextSetBit(idx: scala.Double): scala.Double = js.native
  /**
           * Finds first unset bit, starting at a given index.
           * Return -1 if not found
           *
           * @param idx the starting index for the next unset bit
           */
  def nextUnsetBit(idx: scala.Double): scala.Double = js.native
  /**
           * Performs a bitwise OR on 2 bitsets or 1 bitset and 1 index.
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def or(value: BitSet): BitSet = js.native
  /**
           * Performs a bitwise OR on 2 bitsets or 1 bitset and 1 index.
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def or(value: scala.Double): BitSet = js.native
  /**
           * Finds last set bit, up to a given index.
           * Returns -1 if not found
           *
           * @param idx the starting index for the next unset bit (going in reverse)
           */
  def previousSetBit(idx: scala.Double): scala.Double = js.native
  /**
           * Finds last unset bit, up to a given index.
           * Returns -1 if not found
           */
  def previousUnsetBit(idx: scala.Double): scala.Double = js.native
  /**
           * Reads an unsigned integer of the given bits from the given offset
           *
           * @param bits number of bits, 1 by default
           * @param offset offset, 0 by default
           */
  def readUInt(): scala.Double = js.native
  /**
           * Reads an unsigned integer of the given bits from the given offset
           *
           * @param bits number of bits, 1 by default
           * @param offset offset, 0 by default
           */
  def readUInt(bits: scala.Double): scala.Double = js.native
  /**
           * Reads an unsigned integer of the given bits from the given offset
           *
           * @param bits number of bits, 1 by default
           * @param offset offset, 0 by default
           */
  def readUInt(bits: scala.Double, offset: scala.Double): scala.Double = js.native
  /**
           * Sets a single bit.
           * Returns true if set was successfull
           */
  def set(idx: scala.Double): scala.Boolean = js.native
  /**
           * Sets a range of bits.
           * Returns true if set was successfull
           */
  def setRange(from: scala.Double, to: scala.Double): scala.Boolean = js.native
  /**
           * Converts the bitset to a math.Long number
           */
  def toLong(): Long = js.native
  /**
           * Toggles a single bit
           */
  def toggle(idx: scala.Double): scala.Boolean = js.native
  /**
           * Toggles a range of bits
           */
  def toggleRange(from: scala.Double, to: scala.Double): scala.Boolean = js.native
  /**
           * Unsets a single bit.
           * Returns true if unset was successfull
           */
  def unset(idx: scala.Double): scala.Boolean = js.native
  /**
           * Unsets a range of bits.
           * Returns true if unset was successfull
           */
  def unsetRange(from: scala.Double, to: scala.Double): scala.Boolean = js.native
  /**
           * Writes the given unsigned integer
           *
           * @param val integer
           * @param bits number of bits to write, 1 by default
           * @param offset write offset, 0 by default
           */
  def writeUInt(`val`: scala.Double): scala.Unit = js.native
  /**
           * Writes the given unsigned integer
           *
           * @param val integer
           * @param bits number of bits to write, 1 by default
           * @param offset write offset, 0 by default
           */
  def writeUInt(`val`: scala.Double, bits: scala.Double): scala.Unit = js.native
  /**
           * Writes the given unsigned integer
           *
           * @param val integer
           * @param bits number of bits to write, 1 by default
           * @param offset write offset, 0 by default
           */
  def writeUInt(`val`: scala.Double, bits: scala.Double, offset: scala.Double): scala.Unit = js.native
  /**
           * Performs a bitwise XOR on 2 bitsets or 1 bitset and 1 index.
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def xor(value: BitSet): BitSet = js.native
  /**
           * Performs a bitwise XOR on 2 bitsets or 1 bitset and 1 index.
           * Both bitsets must have the same number of words, no length check is performed to prevent and overflow.
           */
  def xor(value: scala.Double): BitSet = js.native
}

/**
     * Represents a set of bits
     */
@JSGlobal("adone.math.BitSet")
@js.native
object BitSet extends js.Object {
  /**
           * Creates a new BitSet from the given math.Long number
           */
  def fromLong(l: adoneLib.adoneNs.mathNs.Long): adoneLib.adoneNs.mathNs.BitSet = js.native
}

